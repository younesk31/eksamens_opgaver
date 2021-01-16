import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IndsamlingsInfo {
    private int sumall = 0;

    public void calculateAverage() throws IOException {
        File myFile = new File("file.txt");
        FileWriter myWriter = new FileWriter("Gennemsnit.txt");
        Scanner myFileReader = new Scanner(myFile);
        while (myFileReader.hasNextLine()){
            String line = myFileReader.nextLine();
            String[] words = line.split("\\W+");
            int a;
            int sum = 0;
            int days = 0;
            for (int i = 1; i < words.length; i++) {
                a = Integer.parseInt(words[i]);
                sum += a;
                sumAll(a);
                days = words.length-1;
            }
            sum = sum/days;
            System.out.println("Navn: "+words[0]+" - Gennemsnit: "+sum+" kr.");
            String average = "Navn: "+words[0]+" - Gennemsnit: "+sum+" kr.";
            myWriter.write(average+"\n");
        }
        myFileReader.close();
        myWriter.close();
        System.out.println("Indsamlet i alt af indsamlere: "+sumall+" kr.");
        //System.out.println("File - Gennemsnit.txt updated");
    }

    public void sumAll(int sum){
        sumall += sum;
    }
}
