package siit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static siit.TicketType.*;

public class FestivalGate {

    public List<TicketType> ticketTypes = new ArrayList<>();

    public void addTickets(TicketType ticketType) {
        ticketTypes.add(ticketType);
    }

    public void countTickets() {
        System.out.println("========= 5 SECONDS STATS =============");
        System.out.println(Collections.frequency(ticketTypes, ONE_DAY) + " have ONE DAY tickets");
        System.out.println(Collections.frequency(ticketTypes, FULL) + " have FULL tickets");
        System.out.println(Collections.frequency(ticketTypes, FULL_VIP) + " have FULL VIP tickets");
        System.out.println(Collections.frequency(ticketTypes, FREE_PASS) + " have FREE PASS tickets");
        System.out.println(Collections.frequency(ticketTypes, ONE_DAY_VIP) + " have ONE DAY VIP tickets");
        System.out.println("=====================================");
    }
}
