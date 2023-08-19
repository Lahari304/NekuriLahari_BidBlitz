package org.flipkart.repositories;

import org.flipkart.models.Bid;

import java.util.List;
import java.util.Map;

public class BidRepo {

    List<Integer> eventIds;
    Map<Integer, List<Bid>> bidMap;

    private static BidRepo instance = new BidRepo();

    public static BidRepo getInstance(){
        return instance;
    }

    public List<Integer> getIds() {
        return eventIds;
    }

    public void setIds(List<Integer> ids) {
        this.eventIds = ids;
    }

    public Map<Integer, List<Bid>> getBidMap() {
        return bidMap;
    }

    public void setBidMap(Map<Integer, List<Bid>> bidMap) {
        this.bidMap = bidMap;
    }
}
