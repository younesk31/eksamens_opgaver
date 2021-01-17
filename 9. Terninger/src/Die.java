import java.util.Random;

public class Die {
    public static Random rnd = new Random();
    private int die;


    public void changeDie(){
        die = rnd.nextInt(6)+1;
    }

    public int getDie() {
        return die;
    }
}
