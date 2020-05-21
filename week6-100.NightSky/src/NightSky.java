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
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double dense, int width, int height) {
        this.density = dense;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(double dense) {
        this(dense, 20, 10);
    }
    
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }
    
    public void printLine() {
        Random random = new Random();
        for (int i = 0; i < width; i++) {
            double starChance = random.nextDouble();
            if (starChance < this.density) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public void print() {
        starsInLastPrint = 0;
        for (int i = 0; i < height; i++) {
            printLine();
            System.out.print("\n");
        }
    }
    
    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }
}
