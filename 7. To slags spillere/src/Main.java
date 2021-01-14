public class Main {
    public static void main(String[] args) {
        HumanPlayer hp = new HumanPlayer();
        ComputerPlayer cp = new ComputerPlayer();

        GuessingGame gg = new GuessingGame(10);

        gg.turn(hp);
        gg.turn(cp);
    }
}
