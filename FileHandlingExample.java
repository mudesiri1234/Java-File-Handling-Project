import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) {

        try {
            // Writing into file
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, this is my Java file handling project!");
            writer.close();
            System.out.println("Data written successfully.");

            // Reading from file
            FileReader reader = new FileReader("sample.txt");
            int ch;

            System.out.print("File content: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}