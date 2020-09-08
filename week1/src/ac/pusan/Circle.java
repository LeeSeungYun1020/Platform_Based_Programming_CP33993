package ac.pusan;
// 문제 2
public class Circle {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.printf("원의 면적은 %.4f\n", area);
        System.out.printf("원의 둘레는 %.2f\n", circumference);
    }
}
