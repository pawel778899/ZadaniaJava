package Zadanie11;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";

        do {
            System.out.println("Write text: ");
            String text = scanner.nextLine().trim();

            if (text.equalsIgnoreCase("starczy")) {
                break;
            } else if (text.isBlank()) {
                System.out.println("Nie podano żadnego tekstu");
                continue;
            }

            if (text.length() > result.length()) {
                result = text;
            }

        } while (true);

        System.out.println("Najdłużej słowo to " + result + " - ma dlugość " + result.length());
    }
}