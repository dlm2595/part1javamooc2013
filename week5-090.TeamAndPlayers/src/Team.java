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
public class Team {
    private String name;
    private ArrayList<Player> list = new ArrayList();
    private int maxSize = 16;
    
    public Team(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void addPlayer(Player player) {
        if (list.size() < maxSize) list.add(player);
    }
    
    public void printPlayers() {
        for(Player i : list) {
            System.out.println(i);
        }
    }
    
    public void setMaxSize(int size) {
        this.maxSize = size;
    }
    
    public int size() {
        return list.size();
    }
    
    public int goals() {
        int total = 0;
        for (Player i : list) total += i.goals();
        return total;
    }
}
