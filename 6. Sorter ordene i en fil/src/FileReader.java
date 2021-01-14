import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileReader {
    public ArrayList<String> fileReader() throws FileNotFoundException {
        File myFile = new File("file.txt");
        Scanner myFileReader = new Scanner(myFile);
        ArrayList<String> data = new ArrayList<>();
        while (myFileReader.hasNextLine()){
            String line = myFileReader.nextLine().toLowerCase();
            String[] words = line.split("\\W+");
            for (int i = 0; i < words.length; i++) {
                data.add(words[i]);
            }
        }
        myFileReader.close();
        return data;
    }

    public ArrayList<String> sortRead(ArrayList<String> list) throws IOException {
        HashSet<String> set = new HashSet<>(list);
        ArrayList<String> res = new ArrayList<>(set);
        Collections.sort(res, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        FileWriter myWriter = new FileWriter("file.txt");
        myWriter.write(res.toString());
        myWriter.close();
        return res;
    }

}
