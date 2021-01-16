import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
    private final int id;
    private final int duration;
    private final int pricePrhour;
    private final int price;
    private final LocalDate date;
    private final LocalTime time;
    private final boolean valid;
    private static int counter = 1;

    public Ticket(int duration, int pricePrhour) {
        id = counter;
        this.duration = duration;
        this.pricePrhour = pricePrhour;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
        this.valid = isValid();
        this.price = returnPrice();
        counter++;
    }

    public int returnPrice(){
        return this.pricePrhour * this.duration;
    }

    public boolean isValid(){
        if(time.isAfter(time.plusHours(24))){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", duration=" + duration +
                ", pricePrhour=" + pricePrhour +
                ", price=" + price +
                ", date=" + date +
                ", time=" + time +
                ", valid=" + valid +
                '}';
    }
}
