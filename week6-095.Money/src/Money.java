
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money toAdd) {
        int newEuro = euros + toAdd.euros();
        int newCent = cents + toAdd.cents();
        return new Money(newEuro, newCent);
    }
    
    public boolean less(Money compared) {
        if (this.euros < compared.euros()) return true;
        if (this.euros == compared.euros() && this.cents < compared.cents()) return true;
        return false;
    }
    
    public Money minus(Money decremented) {
        if (less(decremented)) return new Money(0,0);
        int neweuros = this.euros - decremented.euros();
        int newcents = this.cents - decremented.cents();
        if (newcents < 100) {
            neweuros--;
            newcents+= 100;
        }
        return new Money(neweuros, newcents);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
