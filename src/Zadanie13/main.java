package Zadanie13;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Type text: ");
        String text = scanner.nextLine();

       //String text = "Ala ma kota i psa";

        Stutterer stutterer = new Stutterer(text);

        stutterer.saySomething();
        stutterer.repeat();

    }

}
