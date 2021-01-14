import java.util.Scanner;

public class HumanPlayer implements Player{

    Scanner input = new Scanner(System.in);

    @Override
    public int guessAnumber(int max) {
        System.out.println("Indtast dit gæt mellem 1 og "+max+": ");
        int guess = input.nextInt();
        return guess;
    }
}
