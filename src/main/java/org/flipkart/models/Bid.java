package org.flipkart.models;

import java.util.Date;
import java.util.List;

public class Bid {

    List<Integer> values;
    Date date;
    int memId;
    int eventId;
    int maxBid;

    public int getMaxBid() {
        return maxBid;
    }

    public void setMaxBid(int maxBid) {
        this.maxBid = maxBid;
    }

    public Bid(List<Integer> value, int memId, int eventId) {
        this.values = value;
        this.memId = memId;
        this.eventId = eventId;

        this.date = new Date();
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> value) {
        this.values = value;
    }

    public int getMemId() {
        return memId;
    }

    public void setMemId(int memId) {
        this.memId = memId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public Date getDate() {
        return date;
    }
}
