import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int fac = 1;
        for (int i = 1; i <= num; i++){
            fac *= i;
        }
        System.out.println("Factorialis " + fac);

    }
}
