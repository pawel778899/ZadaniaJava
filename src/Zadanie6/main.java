package Zadanie6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number: ");
        int n = scanner.nextInt();

        Harmonic harmonic_1 = new Harmonic(100);
        Harmonic harmonic_2 = new Harmonic(n);

        double sum1=harmonic_1.calculate();
        double sum2=harmonic_2.calculate();
        System.out.printf("Suma ciągu harmonicznego wynosi - %f.",sum1);
        System.out.println("\n");
        System.out.printf("Suma ciągu harmonicznego wynosi - %f.",sum2);

    }
}
