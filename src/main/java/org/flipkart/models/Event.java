package org.flipkart.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Event {

    private int id;
    private String eventName;
    private String prizeName;
    private String date;

    private Map<Member, List<Integer>> bids;
    private List<Member> registeredMembers;

    public Map<Member, List<Integer>> getBids() {
        if(bids.isEmpty()){
            bids = new HashMap<>();
        }
        return bids;
    }

    public void setBids(Map<Member, List<Integer>> bids) {
        this.bids = bids;
    }

    public Event(int id, String eventName, String prizeName, String date) {
        this.id = id;
        this.eventName = eventName;
        this.prizeName = prizeName;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
