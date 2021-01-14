import java.util.Random;
import java.util.Scanner;

public class Terningspil {
    Terning kast = new Terning();
    Scanner input = new Scanner(System.in);

    public void terningProdukt() throws Exception {
        Random rnd = new Random();
        kast.setTerning1(rnd.nextInt(6)+1);
        kast.setTerning2(rnd.nextInt(6)+1);
        int typedInt;
        System.out.println("Hvilket produkt vil du have?: ");
        do {
            typedInt = input.nextInt();
            int trys = 0;
            if (typedInt < 36) {
                throw new Exception("Resultater på "+ typedInt +" er ikke mulige med 6-sidet terning");
            }
            while (kast.getTerning1()*kast.getTerning2() != typedInt) {
                System.out.println(kast.getTerning1() + " og " + kast.getTerning2() + " = " + kast.getTerning1()*kast.getTerning2() + " --> Prøver igen");
                kast.setTerning1(rnd.nextInt(6) + 1);
                kast.setTerning2(rnd.nextInt(6) + 1);
                trys++;
            }
            if (typedInt == kast.getTerning1()*kast.getTerning2()) {
                System.out.println(kast.getTerning1() + " og " + kast.getTerning2() + " = " + kast.getTerning1()*kast.getTerning2());
                System.out.println("Det tog: "+(trys+1)+" kast at få: "+typedInt);
            }
        } while (typedInt != kast.getTerning1()*kast.getTerning2());
    }

}
