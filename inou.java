import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // Using try-with-resources to ensure proper resource management
        try (FileInputStream inputStream = new FileInputStream("file.txt");
             FileOutputStream outputStream = new FileOutputStream("copy.txt")) {

            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            // Handling IOException
            e.printStackTrace();
        }
    }
}
