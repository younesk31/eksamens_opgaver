public class Main {

    public static int numberToGuess = 10;

    public static void main(String[] args) {
        HumanPlayer hp = new HumanPlayer();
        ComputerPlayer cp = new ComputerPlayer();

        GuessingGame gg = new GuessingGame(numberToGuess);

        System.out.println("Humans gæt er: "+gg.turn(hp)+"\n");
        System.out.print(" = "+gg.turn(cp));
    }
}
