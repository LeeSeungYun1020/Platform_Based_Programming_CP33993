package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        // 넓이와 부피 출력하기
        Sphere sphere = new Sphere(4);
        System.out.println("원의 넓이는 " + String.format("%.2f", sphere.findArea()) + "이다.");
        System.out.println("구의 부피는 " + String.format("%.2f", sphere.findVolume()) + "이다.");
        try {
            Box box = new Box(2, 3, 4);
            System.out.println("박스의 바닥의 면적은 " + String.format("%.2f", box.findArea()) + "이다.");
            System.out.println("박스의 부피는 " + String.format("%.2f", box.findVolume()) + "이다.");
        } catch (Exception ignored) {
        }

        // PI 출력하기
        System.out.println(Sphere.PI);

        // 비교하기 / 1대1 비교하기
        Sphere newSphere = new Sphere(2);
        int compare = sphere.compareTo(newSphere);
        if (compare > 0)
            System.out.println("기존 sphere가 더 크다.");
        else if (compare == 0)
            System.out.println("크기가 같다.");
        else
            System.out.println("기존 sphere가 더 작다.");
        // 비교하기 / 리스트를 이용하여 정렬하기
        List<Sphere> sphereList = new ArrayList<Sphere>();
        sphereList.add(sphere);
        sphereList.add(newSphere); // ...
        Collections.sort(sphereList);
        for (Sphere s : sphereList) {
            System.out.println(s.findArea());
        }

        // 높이 예외 처리하기
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("가로 : ");
            double width = scanner.nextDouble();
            System.out.print("세로 : ");
            double length = scanner.nextDouble();
            System.out.print("높이 : ");
            double height = scanner.nextDouble();
            Box heightBox = new Box(length, width, height);
            System.out.println("성공! 입력한 박스의 부피는 " + String.format("%.2f", heightBox.findVolume()));
        } catch (HeightException he) {
            System.out.println("실패! " + he.getMessage());
            // System.err.println("실패! " + he.getMessage());
        }
    }
}
