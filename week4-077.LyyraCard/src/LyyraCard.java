/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denzel
 */
public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }
    
    public void payEconomical() {
        // write code here
        if (balance >= 2.5) {
            balance-=2.5;
        }
        
    }

    public void payGourmet() {
        // write code here
        if (balance >= 4) {
            balance -= 4;
        }
    }
    
    public void loadMoney(double amount) {
        // write code here
        double maxAdded = 150 - balance;
        if (amount <= maxAdded && amount > 0) {
            balance += amount;
        } else if (amount > 0) {
            balance += maxAdded;
        }
    }
 
    @Override
    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros";
    }
}
