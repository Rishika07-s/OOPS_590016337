import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileReadWrite {
    public static void main(String[] args) {

        try {

            // Reading file
            FileReader fr = new FileReader("file1.txt");

            int x;
            String content = "";   // Variable to store file data

            while ((x = fr.read()) != -1) {
                content = content + (char) x;
            }

            fr.close();

            FileWriter fw = new FileWriter("file2.txt", true);
            fw.write(content);
            fw.close();

            System.out.println("Data copied successfully from file1.txt to file2.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
