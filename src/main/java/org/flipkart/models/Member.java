package org.flipkart.models;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private int id;
    private String memberName;
    private int superCoins;

    private List<Integer> bids;

    public List<Integer> getBids() {
        if(bids.isEmpty()){
            bids = new ArrayList<>();
        }
        return bids;
    }

    public void setBids(List<Integer> bids) {
        if(this.bids.isEmpty()){
            this.bids = new ArrayList<>();
            return;
        }
        this.bids = bids;
    }

    public Member(int id, String name, int coins){
        this.id = id;
        this.memberName = name;
        this.superCoins = coins;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return memberName;
    }

    public void setName(String memberName) {
        this.memberName = memberName;
    }

    public int getSuperCoins() {
        return superCoins;
    }

    public void setSuperCoins(int superCoins) {
        this.superCoins = superCoins;
    }
}
