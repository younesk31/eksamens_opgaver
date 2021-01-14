import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WordGame {

    public ArrayList<String> repeatWord(ArrayList<String> word, int k){
        if (word == null){
            throw new NullPointerException("Array is null");
        }
        if (k <= 0){
          throw new IllegalArgumentException("Repetition cant be 0 or below");
        }
        ArrayList<String> repeat = new ArrayList<>();
        for (String s: word) {
            for (int i = 0; i < k; i++) {
                repeat.add(s);
            }
        }
        return repeat;
    }

    public ArrayList<String> sortedAndTrimmed(ArrayList<String> sorter){
        if (sorter == null){
            throw new NullPointerException("Array is null");
        }
        ArrayList<String> sorted = new ArrayList<>(sorter);
        Collections.sort(sorted, new Sortbylength());
        return sorted;
    }
}

class Sortbylength  implements Comparator<String>
{
    public int compare(String o1, String o2)
    {
        return o1.length() - o2.length();
    }
}