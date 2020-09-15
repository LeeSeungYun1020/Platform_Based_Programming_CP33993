package ac.pusan;

import java.util.Scanner;

public class Divisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a != 0 && b % a == 0){
            System.out.println(a + " | " + b);
        } else {
            System.out.println(a + " !| " + b);
        }
    }
}
