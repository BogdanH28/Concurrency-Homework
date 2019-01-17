package siit;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        FestivalGate principalGate = new FestivalGate();

        FestivalStatisticsThread statisticsThread = new FestivalStatisticsThread(principalGate);
        statisticsThread.start();

        for(int i = 1; i <= 1000; i++) {
            TicketType ticketType = TicketType.values()[new Random().nextInt(TicketType.values().length)];
            Thread festivalAttendee = new FestivalAttendeeThread(ticketType, principalGate);
            festivalAttendee.start();

            Thread.sleep(250);

            festivalAttendee.join();
        }
    }

}

