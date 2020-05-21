/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Denzel
 */
public class Database {
    private ArrayList<Bird> base;
    
    public Database() {
        base = new ArrayList();
    }
    
    public void Add(Scanner scanner) {
        System.out.print("Name: ");
        String english = scanner.nextLine();
        if (search(english) == false) { 
            System.out.print("Latin Name: ");
            String latin = scanner.nextLine();
            Bird toAdd = new Bird(english, latin);
            base.add(toAdd);
        } else {
            System.out.println("Bird already in database!");
        }
    }
    
    public void Observation(Scanner scanner) {
        System.out.print("What was observed:");
        String seen = scanner.nextLine();
        if (search(seen)) {
            Bird seenbird = retrieve(seen);
            seenbird.addObservation();
        } else {
            System.out.println("Is not a bird!");
        }
    } 
    
    public void Statistics() {
        for (Bird i : base) {
            System.out.println(i);
        }
    }
    
    public void show(Scanner scanner) {
        System.out.print("What?");
        String what = scanner.nextLine();
        if (search (what)) {
            Bird toPrint = retrieve(what);
            System.out.println(toPrint);
        } else {
            System.out.println("It's not a bird!");
        }
    }
    
    public boolean search(String Birdname) {
        for (Bird i : base) {
            if (i.getName().contains(Birdname)) return true;
        }
        return false;
    }
    
    public Bird retrieve(String birdname) {
        for (Bird i : base) {
            if (i.getName().contains(birdname)) return i;
        }
        return null;
    }
}
