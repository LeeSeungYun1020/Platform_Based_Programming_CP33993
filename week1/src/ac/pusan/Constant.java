package ac.pusan;
// 문제 3
public class Constant {
    //public static final double KM_PER_MILE = 1.609344;
    public static void main(String[] args) {
        final double KM_PER_MILE = 1.609344;
        double km;
        double mile = 60.0;

        km = mile * KM_PER_MILE;
        System.out.println("60 마일은 " + km + "km입니다.");
    }
}
