
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        
        System.out.println("Length of the first part: ");
        int first = Integer.parseInt(reader.nextLine());
        
        System.out.println("Result: " + word.substring(0, first));
    }
}
