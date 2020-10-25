package ac.pusan;

public abstract class Currency {

    private double price;

    public Currency(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
