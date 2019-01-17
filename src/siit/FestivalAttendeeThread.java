package siit;

public class FestivalAttendeeThread implements Runnable{

    private TicketType ticketType;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate) {
        this.ticketType = ticketType;
        gate.addTickets(ticketType);
    }

    @Override
    public void run() {
        System.out.println("Ticket bought: " + ticketType);
    }
}
