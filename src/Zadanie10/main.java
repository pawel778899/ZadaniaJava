package Zadanie10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number: ");
        int number = scanner.nextInt();

        DigitSum digitSum = new DigitSum(number);
        System.out.printf("Podana liczba to %d%n", number);

        System.out.println(digitSum.notOptimalSumDigits());
        System.out.println(digitSum.fastSumDigit());
        System.out.println(digitSum.oopSumDigits());
    }
}
