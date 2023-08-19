package org.flipkart.models;

public class Bid {

    int value;
    String time;

    int memId;
    int eventId;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
}
