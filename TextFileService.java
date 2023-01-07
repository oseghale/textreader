import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileService {
    /**
     * the objective is for user to input name of a text file(.txt) and TextFileService class
     * then return a String containing the contents of that text file(.txt)
     * this class will contain methods that read all sorts of different text files
     * @param filename a string representing the name (relative path) of a txt file
     * @return the contents of the file represented by filename
     * @throws FileNotFoundException
     */
    public String readStringFromFile(String filename) {
        File textFile = new File(filename);
        Scanner textScanner;
        String text = "";
        try {
            textScanner = new Scanner(textFile);
            text = textScanner.nextLine();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
           // e.printStackTrace();
           System.out.println("we counldn't find the file ");
        }
        return text;

    }
}
