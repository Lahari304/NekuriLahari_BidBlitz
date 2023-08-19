package org.flipkart.repositories;

import org.flipkart.models.Event;
import org.flipkart.models.Member;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class EventRepo {

    Set<Integer> ids;
    Map<Integer, Event> eventMap;

    private static EventRepo instance = new EventRepo();

    public static EventRepo getInstance(){
        return instance;
    }

    public Set<Integer> getIds() {
        return ids;
    }

    public void setIds(Set<Integer> ids) {
        this.ids = ids;
    }

    public Map<Integer, Event> getEventMap() {
        return eventMap;
    }

    public void setEventMap(Map<Integer, Event> eventMap) {
        this.eventMap = eventMap;
    }
}
