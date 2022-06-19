package Zadanie9;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Type number: ");
        int size = scanner.nextInt();

        Wave wave_1 = new Wave(5);
        Wave wave_2 = new Wave(size);

        wave_1.drawWave();
        wave_2.drawWave();

    }
}