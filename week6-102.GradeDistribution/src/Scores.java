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
public class Scores {
    private ArrayList<Integer> scores;
    
    public Scores() {
        scores = new ArrayList();
    }
    
    public void addScore(Scanner scanner) {
        System.out.println("Type exam scores, -1 completes:");
        while (true) {
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade == -1) break;
            if (grade >= 0 && grade <= 60) scores.add(grade);
        }
    }
    
    public int actualGrade(int score) {
        if (score < 30) {
            return 0;
        } else if (score < 35) {
            return 1;
        } else if (score < 40) {
            return 2;
        } else if (score < 45) {
            return 3;
        } else if (score < 50) {
            return 4;
        } else {
            return 5;
        }
    }
    
    public double passPerc(ArrayList<Integer> list) {
        double passed = 0.0;
        for (int i : list) {
            if (actualGrade(i) > 0) passed++;
        }
        return passed*100/list.size();
    }
    
    public void printResult() {
        System.out.println("Grade distribution:");
        for(int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j : scores){
                if (i == actualGrade(j)) System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("Acceptance percentage: " + passPerc(scores));
    }
    
    
}
