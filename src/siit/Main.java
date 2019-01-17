package siit;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        FestivalGate principalGate = new FestivalGate();

        Runnable statisticsThreadRunnable = new FestivalStatisticsThread(principalGate);
        Thread statisticsThread = new Thread(statisticsThreadRunnable);
        statisticsThread.start();

        for(int i = 1; i <= 1000; i++) {
            TicketType ticketType = TicketType.values()[new Random().nextInt(TicketType.values().length)];
            Runnable festivalAttendeeRunnable = new FestivalAttendeeThread(ticketType, principalGate);
            Thread festivalAttendeeThread = new Thread(festivalAttendeeRunnable);
            festivalAttendeeThread.start();

            Thread.sleep(250);
        }
    }

}

