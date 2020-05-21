
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int until = Integer.parseInt(reader.nextLine());
        int counter = 1;
        int result = 0;
        while(counter <= until ) {
            result += counter;
            counter++;
        }
        System.out.println("Sum: " + result);

    }
}
