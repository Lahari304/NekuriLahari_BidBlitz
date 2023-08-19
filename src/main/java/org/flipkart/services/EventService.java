package org.flipkart.services;

import org.flipkart.models.Event;
import org.flipkart.models.Member;
import org.flipkart.repositories.EventRepo;
import org.flipkart.repositories.MemberRepo;

import java.util.List;

public class EventService {

    private static EventService instance = new EventService();

    private MemberRepo memberRepo = MemberRepo.getInstance();

    private EventRepo eventRepo = EventRepo.getInstance();

    CommonMethods cmn = new CommonMethods();

    public static EventService getInstance() {
        return instance;
    }

    public boolean addMember(int id, String name, int superCoins) {
        if (memberRepo.getMemberMap().isEmpty() || !memberRepo.getIds().contains(id)) {
            memberRepo.getIds().add(id);
            Member member = new Member(id, name, superCoins);
            memberRepo.getMemberMap().put(id, member);
        } else return false;
        return true;
    }

    public boolean addEvent(int id, String eventName, String prizeName, String date) {
        if (eventRepo.getEventMap().isEmpty() || !eventRepo.getIds().contains(id)) {
            eventRepo.getIds().add(id);
            Event event = new Event(id, eventName, prizeName, date);
            eventRepo.getEventMap().put(id, event);
        } else return false;
        return true;
    }

    public boolean registerMember(int memId, int eventId) {
        Event event = eventRepo.getEventMap().get(eventId);
        Member member = memberRepo.getMemberMap().get(memId);
        event.getRegisteredMembers().add(member);
        return true;
    }

    public boolean submitBid(int memId, int eventId, List<Integer> bids) {
        Event event = eventRepo.getEventMap().get(eventId);
        Member member = memberRepo.getMemberMap().get(memId);
        boolean registered = false;

        for(Member mem: event.getRegisteredMembers()){
            if(mem.equals(member)){
                registered = true;
            }
        }

        if(!registered) return false;

        member.setBids(bids);
        event.getBids().put(member, bids);
        return true;
    }

    public Member declareWinner(Event event) {
        return cmn.calculateWinningBid(event);
    }

    public Event getEvent(int eventId){
        return eventRepo.getEventMap().get(eventId);
    }
}
