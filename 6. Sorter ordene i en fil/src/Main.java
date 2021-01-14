import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader();

        System.out.println("File der læses: "+fr.fileReader());

        System.out.println("File der læses igen sorteres, der fjernes dubletter og skriver dem til filen igen: "
                +fr.sortRead(fr.fileReader()));
    }
}
