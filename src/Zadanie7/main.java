package Zadanie7;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number: ");
        int n = scanner.nextInt();

        Fibonacci fibonacci_1 = new Fibonacci(n);
        Fibonacci fibonacci_2 = new Fibonacci(n);

        int element_1 = fibonacci_1.calculateElement(); //1 metoda
        int element_2 = fibonacci_2.calculateElement_optimal_1(); //2 metoda


        System.out.printf("Metoda 1: %d element ciągu wynosi - %d%n", n, element_1);
        System.out.printf("Metoda 2: %d element ciągu wynosi - %d%n", n, element_2);

        //Recursion

        int element_resursion = Fibonacci.calculateElementRecursion(n);
        System.out.printf("Metoda 3(Rekurencja) %d element ciągu wynosi - %d%n", n, element_resursion);

        //Static public field example


        Fibonacci fibonacci_3 = new Fibonacci(5);
        Fibonacci fibonacci_4 = new Fibonacci(10);
        Fibonacci fibonacci_5 = new Fibonacci(100);
        Fibonacci fibonacci_6 = new Fibonacci(20);
        //fibonacci_3.setX(-100);
        System.out.println("");
        System.out.println("Static field Example!");

        System.out.println(fibonacci_3.getX());
        System.out.println(fibonacci_4.x);
        System.out.println(fibonacci_5.x);
        System.out.println(fibonacci_6.getX());

        //Static private field example
        fibonacci_4.setY(-100);

        System.out.println("");
        System.out.println(" Next Static field Example!");
        System.out.println(fibonacci_3.getY());
        System.out.println(fibonacci_4.getY());
        System.out.println(fibonacci_5.getY());
        System.out.println(fibonacci_6.getY());
    }
}
