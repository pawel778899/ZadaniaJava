package Zadanie5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number: ");
        int number = scanner.nextInt();

        PrimeNumbers primeNumbers_1 = new PrimeNumbers(100);
        PrimeNumbers primeNumbers_2 = new PrimeNumbers(number);

        primeNumbers_1.writePrimeNumbers();
        System.out.println("\n");
        primeNumbers_2.writePrimeNumbers();
    }
}
