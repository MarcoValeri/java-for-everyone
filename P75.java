import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class P75 {

    public static void main(String[] args) throws FileNotFoundException {

        // Prompt input file
        System.out.print("Please, select input file: ");
        Scanner getInputFile = new Scanner(System.in);
        String getInput = getInputFile.next();
        System.out.println("Your input file is: " + getInput);

        // Get data by input file
        File inputFile = new File(getInput);
        Scanner input = new Scanner(inputFile);

        // Get character, words and lines by the input file
        String[] inputContent = new String[100];
        int position = 0;
        while (input.hasNext()) {
            String strValue = input.next();
            inputContent[position] = strValue;
            position++;
        }

        // Get the number of the words by input file
       
        /*
        * TEST START
        */

        System.out.println(Arrays.toString(inputContent));
        System.out.println("Lines: ");
        System.out.println("Words: " + position);
        System.out.println("Characters: ");

        /*
        * TEST END
        */

        // Close input file
        getInputFile.close();
        input.close();

    }

}