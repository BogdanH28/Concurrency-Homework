package siit;

public class FestivalStatisticsThread extends Thread {

    private FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate) {
        this.gate = gate;
    }

    @Override
    public void run() {
        do {
            gate.countTickets();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        } while (gate.ticketTypes != null);
    }
}
