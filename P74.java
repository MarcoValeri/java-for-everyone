import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class P74 {

    public static void main(String[] args) throws FileNotFoundException {

        // Prompt input file
        System.out.print("Please, select the input file: ");
        Scanner selectInputFile = new Scanner(System.in);
        String selectedInput = selectInputFile.next();
        System.out.println("Input file is: " + selectedInput);

        // Prompt output file
        System.out.print("Please, select the output file: ");
        Scanner selectOutputFile = new Scanner(System.in);
        String selectedOutput = selectOutputFile.next();
        System.out.println("Output file is: " + selectedOutput);

        // Get data from input file and save them into an array
        File inputFile = new File(selectedInput);
        Scanner input = new Scanner(inputFile);

        float[] inputNumbers = new float[100];
        int items = 0;
        while (input.hasNext()) {
            float value = input.nextFloat();
            inputNumbers[items] = value;
            items++;
        }

        // Save and manipulate data into output file
        PrintWriter outputFile = new PrintWriter(selectedOutput);

        // Create a variable where storing the result for each column
        float resultColumnA = 0;
        float resultColumnB = 0;

        for (int i = 0; i < items; i++) {
            
            if (i % 2 != 0) {
                resultColumnB += inputNumbers[i];
                outputFile.print(inputNumbers[i] + "\n");
            } else {
                resultColumnA += inputNumbers[i];
                outputFile.print(inputNumbers[i] + " ");
            }

        }

        outputFile.println("------------");
        outputFile.println(resultColumnA + " " + resultColumnB);

        /*
        * START test
        */
        System.out.println("inputNumbers:");

        for (int i = 0; i < items; i++) {
            System.out.println(inputNumbers[i]);
        }

        System.out.println("Column A: " + resultColumnA);
        System.out.println("Column B: " + resultColumnB);

        /*
        * END test
        */

        // Close inputs
        selectInputFile.close();
        selectOutputFile.close();
        input.close();
        outputFile.close();

    }

}