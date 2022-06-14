package Zadanie4;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tyoe number: ");
        int number = scanner.nextInt();

        Pifpaf pifpaf_1 = new Pifpaf(20);
        Pifpaf pifpaf_2 = new Pifpaf(number);

        pifpaf_1.writeOnScreen();
        System.out.println("\n");
        pifpaf_2.writeOnScreen();



    }
}