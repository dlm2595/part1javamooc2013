import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            
            if (word.length() == 0) {
                System.out.println("You typed the following words:");
                System.out.println(words);
                break;
            }
            words.add(word);
        }
    }
}
