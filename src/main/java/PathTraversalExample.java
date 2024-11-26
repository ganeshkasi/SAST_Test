import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PathTraversalExample {
    public static void main(String[] args) {
        String userInput = "../../etc/passwd"; // Vulnerable to path traversal
        File file = new File(userInput);
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            System.out.println(new String(data));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
