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
public class Library {
    private ArrayList<Book> lib;
    
    public Library() {
        lib = new ArrayList();
    }
    
    public void addBook(Book newBook) {
        lib.add(newBook);
    }
    
    public void printBooks() {
        for (Book i : lib) System.out.println(i);
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> newlist = new ArrayList();
        for (Book i : lib) {
            if (StringUtils.included(i.title(), title)) newlist.add(i);
        }
        return newlist;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> newlist = new ArrayList();
        for (Book i : lib) {
            if (StringUtils.included(i.publisher(), publisher)) newlist.add(i);
        }
        return newlist;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> newlist = new ArrayList();
        for (Book i : lib) {
            if (year == i.year()) newlist.add(i);
        }
        return newlist;
    }
    
   
}
