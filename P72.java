import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class P72 {

    public static void main(String[] args) throws FileNotFoundException {
        
        // Prompt the input file
        System.out.print("Please, select the input file: ");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println("Your input file is: " + input);

        // Prompt the output file
        System.out.print("Please, select the output file: ");
        Scanner out = new Scanner(System.in);
        String output = out.next();
        System.out.println("Your output file is: " + output);

        // Get data by input file
        File inputFile = new File(input);
        Scanner inFile = new Scanner(inputFile);

        // Write input data to output file
        PrintWriter outputFile = new PrintWriter(output);

        int line = 1;
        while (inFile.hasNext()) {
            String value = inFile.nextLine();
            outputFile.println("/* " + line + " */" + value);
            line++;
        }

        // Close Scanner file
        in.close();
        out.close();
        inFile.close();
        outputFile.close();

    }

}