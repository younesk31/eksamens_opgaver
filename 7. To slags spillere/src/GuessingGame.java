public class GuessingGame {
    private final int numberToBeGuessed;

    public GuessingGame(int numberToBeGuessed) {
        this.numberToBeGuessed = numberToBeGuessed;
    }

    public boolean turn(Player gamer){
        return gamer.guessAnumber(Main.numberToGuess) == numberToBeGuessed;
    }
}
