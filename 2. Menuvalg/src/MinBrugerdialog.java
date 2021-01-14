import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MinBrugerdialog implements Brugerdialog {

    public int menuvalg(ArrayList<String> valg) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMenu:\n" + "1. " + valg.get(0) + "\n" + "2. " + valg.get(1) + "\n" + "3. " + valg.get(2) + "\nIndtast dit valg: ");
        try {
            int num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Du har valgt " + valg.get(num - 1));
                    return 1;
                case 2:
                    System.out.println("Du har valgt " + valg.get(num - 1));
                    return 2;
                case 3:
                    System.out.println("Du har valgt " + valg.get(num - 1));
                    return 3;
                default:
                    throw new NullPointerException("indtast en int!");
            }
        } catch (InputMismatchException exception) {
            throw new InputMismatchException("Din indtastning skal være en int!");
        }
    }
}
