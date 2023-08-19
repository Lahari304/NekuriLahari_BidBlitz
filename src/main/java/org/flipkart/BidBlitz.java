package org.flipkart;

import org.flipkart.models.Bid;
import org.flipkart.models.Event;
import org.flipkart.models.Member;
import org.flipkart.services.EventService;

import java.util.*;

public class BidBlitz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to BidBlitz !!");

        EventService eventService = EventService.getInstance();

        while(true){

            //add loop break logic

            System.out.println("Your wish is my command .. :");
            String[] input = sc.nextLine().split(" ");
            String command = input[0];

            switch(command){
                case "ADD_MEMBER":
                    // id name coins
                    eventService.addMember(Integer.parseInt(input[1]), input[2], Integer.parseInt(input[3]));
                    System.out.println("Member added successfully.");
                    break;
                case "ADD_EVENT":
                    // id name prize date
                    eventService.addEvent(Integer.parseInt(input[1]), input[2], input[3], input[4]);
                    System.out.println("Event added successfully.");
                    break;
                case "REGISTER_MEMBER":
                    // memid evid
                    eventService.registerMember(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                    System.out.println("Member registration for event " + input[2] +" successful.");
                    break;
                case "SUBMIT_BID ":
                    List<Integer> bids = new ArrayList<>();
                    for(int i=0; i<input.length && i<8; i++){
                        if(i>2){
                            bids.add(Integer.parseInt(input[i]));
                        }
                    }
                    eventService.submitBid(Integer.parseInt(input[1]), Integer.parseInt(input[2]), bids);
                    System.out.println("Bid submitted for event ");
                    break;
                case "DECLARE_WINNER":
                    Event event = eventService.getEvent(Integer.parseInt(input[1]));
                    Bid winnerBid = eventService.declareWinner(event);
                    Member winner = eventService.getMemberbyId(winnerBid.getMemId());
                    System.out.println(winner.getName() + " wins the " + event.getPrizeName()+
                            " with highest bid " + winnerBid.getMaxBid());
                    // add bid value
                    break;

                default:
                    System.out.println("Done");
            }

        }
    }
}