package ac.pusan;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int i;
        for (i = 0; i < 10; i++) {
            int point;
            do {
                System.out.print(i + 1 + " : ");
                point = scanner.nextInt();
            } while(point < -1 || point > 100);

            if (point == -1) {
                break;
            }
            sum += point;

            char grade;
            switch (point / 10){
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                default:
                    grade = 'F';
            }
            System.out.printf("Score : %d(%c)\n", point, grade);
        }
        if (i == 0)
            System.out.println("No input.");
        else
            System.out.printf("Average : %.2f\n", sum / i);
    }
}
