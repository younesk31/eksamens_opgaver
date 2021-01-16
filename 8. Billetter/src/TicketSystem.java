import java.util.ArrayList;

public class TicketSystem {

    public void createTicket(int duration, int pricePrHour){
        Ticket t = new Ticket(duration, pricePrHour);
        ArrayList<Ticket> tt = new ArrayList<>();
        if (duration > 24) {
            throw new IllegalArgumentException("Varigheden af en billet kan max være 24 timer");
        }
        tt.add(t);
        System.out.println(tt);
    }
}
