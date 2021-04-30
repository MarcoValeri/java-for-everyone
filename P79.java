import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

public class P79 {

    /*
    * Create a method that saves the data into a file
    * @parameter String data to write into the output file
    * @parameter String output file
    */
    public static void writeFile(String data, String selectedFile) throws FileNotFoundException {

        PrintWriter output = new PrintWriter(selectedFile);
        output.println(data);
        output.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        
        /*
        * Get the data by the input file and save them into an array
        * Each element of the array is a line of text of the file
        * Input file is selected by the args[0]
        */
        File inputFile = new File(args[0]);
        Scanner input = new Scanner(inputFile);

        String[] inputElements = new String[100];
        int position = 0;
        while (input.hasNext()) {
            String data = input.nextLine();
            inputElements[position] = data;
            position++;
        }

        input.close();


        /*
        * Write the element of the array in the reverse order
        * into the output file
        * Output file is selected by args[1]
        */
        String outputElements = "";
        for (int i = position - 1; i >= 0; i--) {
            outputElements+= inputElements[i] + "\n";
        }
        writeFile(outputElements, args[1]);


        /*
        * TEST
        */
        System.out.println("Position: " + position);
        System.out.println(Arrays.toString(inputElements));

    }

}