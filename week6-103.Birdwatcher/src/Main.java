import java.util.*;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    Scanner reader = new Scanner(System.in);
    Database base = new Database();
    while (true) {
        System.out.print("?");
        String command = reader.nextLine();
        if (command.equals("Add")){
            base.Add(reader);
        } else if (command.equals("Observation")) {
            base.Observation(reader);
        } else if (command.equals("Statistics")) {
            base.Statistics();
        } else if (command.equals("Show")) {
            base.show(reader);
        } else if (command.equals("Quit")) {
            break;
        } else {
            System.out.println("Invalid command. Valid commands: Add, Observation, Statistics, Show and Quit.");
        }
    }
            
    }

}
