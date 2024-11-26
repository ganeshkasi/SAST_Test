import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommandInjectionExample {
    public static void main(String[] args) {
        String userInput = "ls"; // Vulnerable to command injection
        try {
            Process process = Runtime.getRuntime().exec(userInput);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
