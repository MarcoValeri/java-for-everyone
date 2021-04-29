import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class P78 {

    /*
    * Create a method that reverse the string
    * @parameter String
    * @return String reverse
    */
    public static String reverseString(String str) {

        String reverse = "";
        int strLength = str.length();

        for (int i = strLength; i > 0; i--) {
            reverse+= str.charAt(i - 1);
        }

        return reverse;
    }

    /*
    * Create a method that saves the data into a file
    * @parameter String data to write into the output file
    * @parameter String output file
    */
    public static void writeFile(String data, String selectedFile) throws FileNotFoundException {

        PrintWriter outputFile = new PrintWriter(selectedFile);
        outputFile.print(data);

        outputFile.close();

    }

    public static void main(String[] args) throws FileNotFoundException {

        // Get data by input file
        File inputFile = new File(args[0]);
        Scanner input = new Scanner(inputFile);

        // Write input data to output file
        String value = "";
        while (input.hasNext()) {
            String data = input.nextLine();
            value+= data + "\n";
        }
        
        writeFile(reverseString(value), "HelloPrinter.java");

        input.close();

    }

}