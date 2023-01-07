import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main (String[] args) throws FileNotFoundException {
        TextFileService tfs = new TextFileService();
        Scanner fileNameScanner = new Scanner(System.in);
        System.out.println("please input file name: ");
        String filename = fileNameScanner.nextLine();
        String contents = tfs.readStringFromFile(filename);
        System.out.println(contents);
        System.out.println("thank you for using the file reading app! ");
    }

}
/**
 * Exceptions
 *      Exceptions (checked- must be handled, happen from unpredictable situations - eg network issues)
 *      Runtime exceptions (unchecked - do not need to be handled, developer can avoid them logically - eg divide by 0)
 *  'throws' declaration - a method is capable of transfering its exception to method that called it
 * try/catch block - a piece of code that can attempt a 'risky' piece of code and has another block of code that catch(runs)
 *   the exception and runs when an exception is thrown
 * custom exceptions can be written for situations Java doesn't predict by default(eg external sensors)
 * Errors vs Exceptions - errors happen external to the code e.g. OutofMemoryError
 * 
 */