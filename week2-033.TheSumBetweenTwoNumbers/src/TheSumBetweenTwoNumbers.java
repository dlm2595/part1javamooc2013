
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("first");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("last");
        int last = Integer.parseInt(reader.nextLine());
        
        int result = 0;
        
        for (int i = first; i <= last; i++) {
            result += i;
        }
        System.out.println("The sum is " + result);
    }
}
