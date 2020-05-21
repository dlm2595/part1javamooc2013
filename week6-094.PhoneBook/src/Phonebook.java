/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denzel
 */
import java.util.*;

public class Phonebook {
    private ArrayList<Person> book = new ArrayList();
    
    public void add(String name, String number) {
        Person toAdd = new Person(name, number);
        book.add(toAdd);
    }
    
    public void printAll() {
        for (Person i : book) System.out.println(i);
    }
    
    public String searchNumber(String name) {
        for (Person i:book) {
            if(name.equals(i.getName())) return i.getNumber();
        }
        return "number not known";
    }
}
