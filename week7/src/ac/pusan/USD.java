package ac.pusan;

public class USD extends Currency {
    public USD(double dollar){
        super(dollar);
    }
    @Override
    public String toString() {
        return getPrice() + " dollar";
    }
}
