import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MinBrugerdialog menu = new MinBrugerdialog();
        ArrayList<String> valg = new ArrayList<>();
        valg.add("Agurk");
        valg.add("Tomat");
        valg.add("Salat");
        menu.menuvalg(valg);

        Mockdialog mock = new Mockdialog(1);
        System.out.println("MockDialog valg --> "+mock.menuvalg(valg));
    }
}
