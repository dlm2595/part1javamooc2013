import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        System.out.println("Type numbers:");
        Scanner reader = new Scanner(System.in);
        int num;
        int sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + counter);
                double mean = (double)sum/counter;
                System.out.println("Average: " + mean);
                System.out.println("Even numbers: "+even);
                System.out.println("Odd numbers: "+odd);
                break;
            }
            sum+=num;
            counter++;
            if(num%2==0){
                even++;
            } else {
                odd++;
            }
            
        }
        

    }
}
