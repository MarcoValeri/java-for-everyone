import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class P75 {

    /*
    * Create a mehod that gets the number of the words by a file
    */
    public static int getWordsNumber(String file) throws FileNotFoundException {
        File inputFile = new File(file);
        Scanner input = new Scanner(inputFile);

        int words = 0;
        while (input.hasNext()) {
            String value = input.next();
            words++;
        }

        input.close();

        return words;
    }

    public static void main(String[] args) throws FileNotFoundException {

        // Prompt input file
        System.out.print("Please, select input file: ");
        Scanner getInputFile = new Scanner(System.in);
        String getInput = getInputFile.next();
        System.out.println("Your input file is: " + getInput);

        // Get data by input file
        File inputFile = new File(getInput);
        Scanner input = new Scanner(inputFile);

        // Get lines by the input file
        String[] inputContent = new String[100];
        int lines = 0;
        while (input.hasNext()) {
            String strValue = input.nextLine();
            inputContent[lines] = strValue;
            lines++;
        }

        // Save array elements into a variable
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < inputContent.length; i++) {
            if (inputContent[i] != null) {
                sb.append(inputContent[i]);
            }
        }

        String str = sb.toString();
       
        /*
        * TEST START
        */

        System.out.println(Arrays.toString(inputContent));
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + getWordsNumber(getInput));
        System.out.println("Characters: " + str.length());
        System.out.println(str);

        /*
        * TEST END
        */

        // Close input file
        getInputFile.close();
        input.close();

    }

}