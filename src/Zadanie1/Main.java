package Zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type circle diameter: ");
        float diameter = scanner.nextFloat();

        Circle circle_1 = new Circle(100);
        Circle circle_2 = new Circle(5);
        Circle circle_3 = new Circle(diameter);

        System.out.println(circle_1.calculatePerimeter());
        System.out.println(circle_2.calculatePerimeter());
        System.out.println(circle_3.calculatePerimeter());


    }
}