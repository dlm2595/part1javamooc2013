import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    int length;
    Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(26);
            password += "abcdefghijklmnopqrstuvwxyz".charAt(index);
        }
        return password;
    }
}
