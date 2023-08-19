package org.flipkart.models;

import java.util.*;

public class Event {

    private int id;
    private String eventName;
    private String prizeName;
    private Date date;

    private Map<Member, Bid> bids;
    private List<Member> registeredMembers;

    public Map<Member, Bid> getBids() {
        if(bids.isEmpty()){
            bids = new HashMap<>();
        }
        return bids;
    }

    public void setBids(Map<Member, Bid> bids) {
        this.bids = bids;
    }

    public Event(int id, String eventName, String prizeName, int[] dateTokens) {
        this.id = id;
        this.eventName = eventName;
        this.prizeName = prizeName;
        this.date = new Date(dateTokens[0], dateTokens[1], dateTokens[2]);
    }

    public List<Member> getRegisteredMembers() {
        if(registeredMembers.isEmpty()){
            registeredMembers = new ArrayList<>();
        }
        return registeredMembers;
    }

    public void setRegisteredMembers(List<Member> registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public Date getDate() {
        return date;
    }

}
