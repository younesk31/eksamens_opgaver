import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

    }

    public void dieProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hvilket produkt vil du have?: ");
        int userInput = input.nextInt();
        testDice(userInput);
        Die throwDie1 = new Die();
        Die throwDie2 = new Die();
        int counter = 0;
        do {
            throwDie1.changeDie();
            throwDie2.changeDie();
            System.out.println(throwDie1.getDie() + " og " + throwDie2.getDie() + " = " +(throwDie1.getDie()*throwDie2.getDie()));
            counter++;
            if (userInput == (throwDie1.getDie()*throwDie2.getDie())){
                System.out.println("Du fik '"+userInput+"' i '" +counter+"' forsøg sådan!");
            }
        }while (userInput != (throwDie1.getDie()*throwDie2.getDie()));
    }

    private void testDice(int result) {
        for (int d1 = 1; d1 <= 6; d1++) {
            for (int d2 = 1; d2 <= 6 ; d2++) {
                if (d1*d2 == result){
                    return;
                }
            }

        }
        throw new IllegalArgumentException("Produkt er ikke er muligt!");
    }
}
