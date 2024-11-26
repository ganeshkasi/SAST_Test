import java.security.SecureRandom;
import java.util.Random;

public class InsecureRandomnessExample {
    public static void main(String[] args) {
        Random random = new Random(); // Insecure randomness
        int randomNumber = random.nextInt();
        System.out.println("Random number: " + randomNumber);

        SecureRandom secureRandom = new SecureRandom(); // Secure randomness
        int secureRandomNumber = secureRandom.nextInt();
        System.out.println("Secure random number: " + secureRandomNumber);
    }
}