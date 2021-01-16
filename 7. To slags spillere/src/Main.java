import java.util.Random;

public class Main {

    private static final Random rnd = new Random();
    private static final int numberToGuess = rnd.nextInt(10)+1;

    public static void main(String[] args) {
        HumanPlayer hp = new HumanPlayer();
        ComputerPlayer cp = new ComputerPlayer();

        GuessingGame gg = new GuessingGame(numberToGuess);

        System.out.println("Humans gæt er: "+gg.turn(hp)+"\n");
        System.out.print(" = "+gg.turn(cp)+"\n\n");
        System.out.println("The correct number to be guessed is: "+numberToGuess);
    }
}
