package org.flipkart.services;

import org.flipkart.models.Bid;
import org.flipkart.models.Event;
import org.flipkart.models.Member;

import java.util.*;

public class CommonMethods {

    Random random = new Random();

    public int generateId(Set<Integer> ids){

        Integer generated = 1;

        while(ids.contains(generated)){
            generated = random.nextInt();
        }

        return generated;
    }

    public int[] generateDateTokens(String date){

        int [] dateTokens = new int[3];
        int i =0;
        for(String s: date.split("-")){
            dateTokens[i++] = Integer.parseInt(s);
        }

        return dateTokens;
    }

    public Bid calculateWinningBid(Event event){
        Bid winningBid = null, runnerBid = null;
        int maxVal = 0;

        Map<Member, Bid> bids = event.getBids();

        for(Member mem : event.getRegisteredMembers()){
            if(bids.get(mem) != null){
                Bid currBid = bids.get(mem);
                int currMax = findMaxBid(currBid.getValues());
                currBid.setMaxBid(currMax);
                if(currMax > maxVal){
                    runnerBid = (winningBid == null)? currBid : winningBid;
                    winningBid = currBid;
                    maxVal = currMax;
                }
                if(currMax == maxVal){
                    if(winningBid == null) winningBid = currBid;
                    if(winningBid.getDate().compareTo(currBid.getDate()) > 0){
                        runnerBid = winningBid;
                        winningBid = currBid;
                    }
                }
            }
        }

        return winningBid;
    }

    private int findMaxBid(List<Integer> bids){
        int maxVal = 0;

        for(int i: bids){
            maxVal = (i>=maxVal) ? i : maxVal;
        }

        return maxVal;
    }
}
