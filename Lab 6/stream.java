import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class stream {
    public static void main(String[] args) {

        try {
            //  Writing 
            FileOutputStream fos = new FileOutputStream("stream.txt");
            String data = "My name is Rishika"
        ;
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written successfully.");

            //  Reading 
            FileInputStream fis = new FileInputStream("stream.txt");
            int i;
            System.out.println("Reading data from file:");

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }   
}