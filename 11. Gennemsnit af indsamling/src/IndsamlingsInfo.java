import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IndsamlingsInfo {
    private int sumall = 0;

    public void calculateAverage() throws IOException {
        File myFile = new File("file.txt");
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
                days = words.length-1;
            }
            sum = sum/days;
            System.out.println("Navn: "+words[0]+" - Gennemsnit: "+sum);
            String average = "Navn: "+words[0]+" - Gennemsnit: "+sum;
            sumAll(sum);
        }
        myFileReader.close();
    }
/*
    public void createFile(String average) throws IOException {
        FileWriter myWriter = new FileWriter("Gennemsnit.txt");
        myWriter.write(average);
        myWriter.close();
    }
 */
    public void sumAll(int sum){
        sumall += sum;
        System.out.println("Sum i alt: "+sumall); ;
    }


}
