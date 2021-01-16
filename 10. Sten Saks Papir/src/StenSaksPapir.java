import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {

    public static void brugerValg() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String r = "rock";
        String p = "paper";
        String s = "scissors";

        String[] plays = {r, p, s};

        boolean quit = false;
        String comPlay;
        String yourPlay;

        int index;

        while (!quit) {
            System.out.println("Do your play: (rock/scissors/paper");
            yourPlay = scanner.nextLine();


            index = random.nextInt(3);
            comPlay = plays[index];

            System.out.println("Your play: " + yourPlay + " Computer's play: " + comPlay);

            if (yourPlay.equals(comPlay)) {
                System.out.println("Tie!");
            } else if (yourPlay.equals(r) && comPlay.equals(p)) {
                System.out.println("Computer wins!");

            } else if (yourPlay.equals(s) && comPlay.equals(p)) {
                System.out.println("You win!");

            } else if (yourPlay.equals(p) && comPlay.equals(s)) {
                System.out.println("Computer wins!");
            }
        }
    }
}