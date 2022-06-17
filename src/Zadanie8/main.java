package Zadanie8;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a: ");
        float a = scanner.nextFloat();
        System.out.println("Type +-/*: ");
        char operationSign = scanner.next().charAt(0);
        System.out.println("Type b: ");
        float b = scanner.nextFloat();

        Calculator calculator = new Calculator(a, operationSign, b);

        System.out.println(calculator.calculateWithSwitch()); //if else
        System.out.println(calculator.calculate()); //switch



        //przykład z zajęć

        String example = "+asdgh123";
        char[] table = example.toCharArray();

        for (int i = 0; i < table.length; i++) {
            System.out.printf("Index = %d, Char pod indexem = %c%n", i, table[i]);
        }
    }
}