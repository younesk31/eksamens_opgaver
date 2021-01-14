import java.util.Random;

public class ComputerPlayer implements Player{

    @Override
    public int guessAnumber(int max) {
        Random rnd = new Random();
        int guess = rnd.nextInt(max)+1;
        System.out.print("Computers gæt: "+ guess);
        return guess;
    }
}
