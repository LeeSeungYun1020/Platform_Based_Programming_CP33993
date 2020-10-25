package ac.pusan;

public class KRW extends Currency {
    public KRW(double won){
        super(won);
    }
    @Override
    public String toString() {
        return getPrice() + " won";
    }
}
