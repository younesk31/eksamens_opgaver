public class GuessingGame {
    private final int numberToBeGuessed;

    public GuessingGame(int numberToBeGuessed) {
        this.numberToBeGuessed = numberToBeGuessed;
    }

    public boolean turn(Player gamer){
        if (gamer.guessAnumber(10) == numberToBeGuessed){
            System.out.println(gamer+ " gættede rigtigt");
            return true;
        } else {
            System.out.println(gamer+" Gættede forkert");
            return false;
        }
    }
}
