package org.flipkart.services;

import org.flipkart.models.Event;
import org.flipkart.models.Member;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class CommonMethods {

    Random random = new Random();

    public int generateId(Set<Integer> ids){

        Integer generated = 1;

        while(ids.contains(generated)){
            generated = random.nextInt();
        }

        return generated;
    }

    public Member calculateWinningBid(Event event){
        int maxBid = 0, secMax = 0;
        Member winningMem = null, runner = null;

        Map<Member, List<Integer>> bids = event.getBids();

        for(Member mem : event.getRegisteredMembers()){
            if(bids.get(mem) != null){
                int currMax = findMaxBid(bids.get(mem));
                if(currMax >= maxBid){
                    secMax = maxBid;
                    maxBid = currMax;

                    runner = (winningMem == null) ? mem : winningMem;
                    winningMem = mem;
                }
            }
        }

        return winningMem;
    }

    private int findMaxBid(List<Integer> bids){
        int maxVal = 0;

        for(int i: bids){
            maxVal = (i>=maxVal) ? i : maxVal;
        }

        return maxVal;
    }
}
