package Zadanie20;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed){
            System.out.println("Podaj liczbę: ");
            int userNumber = scanner.nextInt();

            if(userNumber <numberToGuess) {
                System.out.println("Za mała");
            }
            else if(userNumber > numberToGuess) {
                System.out.println("Za duża");
            }
            else {
                System.out.println("Bingo");
                wasNumberGuessed=true;
            }
        }
    }
}
