import java.util.Scanner;

public class HumanPlayer implements Player{

    @Override
    public int guessAnumber(int max) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et gæt mellem 1 og "+max+"!");
        int guess;
        do {
            guess = input.nextInt();
            if (guess < 1 || guess > max) {
                System.out.println("Hvad forstod du ikke ved ”Mellem 1 og " + max + "”?");
            }
        } while (guess < 1 || guess > max);
        return guess;
    }
}
