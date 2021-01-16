import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private boolean running = true;
    private int userPoints;
    private int computerPoints;

    public String userChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("skrive enten ”sten”, ”saks” eller ”papir”");
        switch (input.nextLine()) {
            case "sten":
                return "sten";
            case "saks":
                return "saks";
            case "papir":
                return "papir";
            case "slut":
                running = false;
                System.out.println("Spiller havde: "+userPoints+" point!");
                System.out.println("Computer havde: "+computerPoints+" point!");
                if (computerPoints < userPoints){
                    System.out.println("Spiller vinder");
                } else {
                    System.out.println("Computer vinder");
                }
                break;
        }
        return "lukker..";
    }


    public String computerChoice() {
        Random rnd = new Random();
        if (rnd.nextInt(2) == 0) {
            return "sten";
        } else if (rnd.nextInt(2) == 1) {
            return "saks";
        } else {
            return "papir";
        }
    }


    public void game() {
        while (running) {
            switch (userChoice()) {
                case "sten":
                    if (computerChoice().equals("saks")) {
                        System.out.println("user won");
                        userPoints++;
                    } else if (computerChoice().equals("sten")) {
                        System.out.println("uafgjort");
                    } else {
                        System.out.println("Computer vandt");
                        computerPoints++;
                    }
                    break;
                case "saks":
                    if (computerChoice().equals("papir")) {
                        System.out.println("user won");
                        userPoints++;
                    } else if (computerChoice().equals("saks")) {
                        System.out.println("uafgjort");
                    } else {
                        System.out.println("computer vandt");
                        computerPoints++;
                    }
                    break;
                case "papir":
                    if (computerChoice().equals("sten")) {
                        System.out.println("user won");
                        userPoints++;
                    } else if (computerChoice().equals("papir")) {
                        System.out.println("uafgjort");
                    } else {
                        System.out.println("computer vandt");
                        computerPoints++;
                    }
                    break;
            }
        }
    }
}

