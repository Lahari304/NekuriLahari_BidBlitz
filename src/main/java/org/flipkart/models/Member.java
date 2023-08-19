package org.flipkart.models;

public class Member {

    private int id;
    private String memberName;
    private int superCoins;

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
