import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("Hello");
        word.add("World");
        WordGame game = new WordGame();

        System.out.println("Repeat words: "+game.repeatWord(word,3));
        System.out.println("Sorted list : "+game.sortedAndTrimmed(word));
    }
}
