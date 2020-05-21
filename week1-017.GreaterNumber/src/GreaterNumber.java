import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        if (num1 == num2) {
            System.out.println("The numbers are equal!");
        } else {
            System.out.println("The greater number is: " + Math.max(num1, num2));
        }

    }
}
