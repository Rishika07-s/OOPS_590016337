import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class append{
    public static void main(String[] args) {

        try {
            //  Reading 
            FileInputStream fis = new FileInputStream("stream.txt");
            int i;
            System.out.println("Reading data from file:");

            //  Writing 
            FileOutputStream fos = new FileOutputStream("stream.txt", true); // true for append mode
            String data = "My name is Rishika";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written successfully.");


            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }   
}