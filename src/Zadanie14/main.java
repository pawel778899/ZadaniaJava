package Zadanie14;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 1st letter: ");
        char firstLetter = scanner.next().charAt(0);
        System.out.println("Type 2nd letter: ");
        char secondLetter = scanner.next().charAt(0);

        LettersBetween lettersBetween = new LettersBetween(firstLetter, secondLetter);
        int result = lettersBetween.calculateLettersBetween();

        System.out.printf("Pomiedzy literami %c oraz %c jest %d znaków.", firstLetter, secondLetter, result);
    }
}