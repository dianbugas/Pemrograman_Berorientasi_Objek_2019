import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BacaFile {

    public static void main(String[] args) throws IOException {

        BufferedWriter output = null;

        try {
            FileWriter hellotext = new FileWriter("hello.txt");       //Editing the file
            output = new BufferedWriter(hellotext);
            output.write("Hello World!");
            System.out.println("the hello.txt File has been edited");
        } catch (IOException error) {
            System.err.println("Error: " + error.getMessage());      //File corruption or not found message)
        } finally {
            if (output != null) {
                output.close();
            }
        }
        BufferedReader in1 = null;
        try {
            FileReader hellotext = new FileReader("hello.txt");
            in1 = new BufferedReader(hellotext);
            String textfile1 = in1.readLine();
            System.out.println("Data in file: ");
            System.out.println(textfile1);
        } catch (IOException error) {
            System.err.println("Error: " + error.getMessage());      //File corruption or  not found message)
        } finally {
            if (in1 != null) {
                in1.close();
            }

        }
    }
}