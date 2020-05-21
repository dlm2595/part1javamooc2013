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
public class Bird {
    private String english;
    private String latin;
    private int observations;
    
    public Bird(String e, String l) {
        this.english = e;
        this.latin = l;
        this.observations = 0;
    }
    
    public void addObservation() {
        observations++;
    }
    
    public String getName() {
        return this.english;
    }
    
    @Override
    public String toString() {
        return english + "("+ latin + "): " + observations + "observations";
    }
}
