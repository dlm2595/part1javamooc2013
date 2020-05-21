
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment apartment2) {
        if (this.squareMeters > apartment2.squareMeters) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment apartment2) {
        int price1 = this.pricePerSquareMeter*this.squareMeters;
        int price2 = apartment2.pricePerSquareMeter*apartment2.squareMeters;
        return Math.max(price1, price2) - Math.min(price1, price2);
    }
    
    public boolean moreExpensiveThan(Apartment apartment2 ) {
        int price1 = this.pricePerSquareMeter*this.squareMeters;
        int price2 = apartment2.pricePerSquareMeter*apartment2.squareMeters;
        
        if (price1 > price2) return true;
        
        return false;
    }
}
