package task;
import java.security.SecureRandom;
import java.util.Random;

public class RandomPasswordGenerator {
	
	    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";

	    public static void main(String[] args) {
	        int length = 10; // Specify the length of the generated password

	        String generatedPassword = generateRandomPassword(length);
	        System.out.println("Generated Password: " + generatedPassword);
	    }

	    public static String generateRandomPassword(int length) {
	        StringBuilder password = new StringBuilder();

	        Random random = new SecureRandom();
	        for (int i = 0; i < length; i++) {
	            int randomIndex = random.nextInt(CHARACTERS.length());
	            password.append(CHARACTERS.charAt(randomIndex));
	        }

	        return password.toString();
	    }
	

	
}
