
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            
            if (name.equals("")) break;
            
            System.out.print("studentnumber: ");
            String stnr = reader.nextLine();
            
            list.add(new Student(name, stnr));
        }
        
        for (Student i : list) System.out.println(i);
        
        System.out.println("");
        
        System.out.print("Give search term: ");
        String term = reader.nextLine();
        
        System.out.println("Result:");
        
        for (Student i : list) {
            if (i.getName().contains(term)) System.out.println(i);
        }
    }
}
