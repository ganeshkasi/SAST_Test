import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class InsecureDeserializationExample {
    public static void main(String[] args) {
        try {
            byte[] data = getUserInput(); // Assume this comes from an untrusted source
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            Object obj = ois.readObject(); // Vulnerable to insecure deserialization
            System.out.println("Deserialized object: " + obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static byte[] getUserInput() {
        // Simulate user input
        return new byte[]{};
    }
}
