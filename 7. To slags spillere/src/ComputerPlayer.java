import java.util.Random;

public class ComputerPlayer implements Player{

    Random rnd = new Random();
    @Override
    public int guessAnumber(int max) {
        int guess = rnd.nextInt(max)+1;
        System.out.println("Computers gæt er: "+ guess);
        return guess;
    }
}
