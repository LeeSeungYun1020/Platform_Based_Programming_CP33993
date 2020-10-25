package ac.pusan;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ExchangeTest {

    public static void main(String[] args) {
        // 람다식 이용하여 환전 함수 작성
        Exchangeable exchangeToDollar = krw -> krw * 0.00086;
        Exchangeable exchangeToWon = usd -> usd * 1162;

        Scanner scanner = new Scanner(System.in);
        try{
            while(true){
                // 사용자 입력
                System.out.println("Choose Currency");
                System.out.println("1. KRW\t2.USD");
                int currencyType = scanner.nextInt();
                if (currencyType != 1 && currencyType != 2)
                    throw new Exception("Invalid number");
                System.out.println("Enter the amount");
                double amount = scanner.nextDouble();
                if(amount < 0)
                    throw new Exception("Invalid amount");
                // 환전된 화폐의 객체 생성
                Currency currency;
                if (currencyType == 1) {
                    currency = new USD(exchangeToDollar.exchange(amount));
                } else {
                    currency = new KRW(exchangeToWon.exchange(amount));
                }
                // 환전 정보 출력
                System.out.println("Exchange money : " + currency);
            }// 잘못된 입력에 대한 정보 출력
        }catch (InputMismatchException ime){
            System.err.println("Input mismatch");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        // 프로그램 종료
        System.out.println("프로그램 종료");
    }
}
