import java.util.ArrayList;

public class Mockdialog implements Brugerdialog{
    int hey;

    public Mockdialog(int hey) {
        this.hey = hey;
    }


    @Override
    public int menuvalg(ArrayList<String> valg) {
        return this.hey;
    }
}
