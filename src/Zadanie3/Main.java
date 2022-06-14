package Zadanie3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.println("Type a: ");
        int a = scanner.nextInt();
        System.out.println("Type b: ");
        int b = scanner.nextInt();
        System.out.println("Type c: ");
        int c = scanner.nextInt();



      QuadraticEquation quadraticEquation_1 = new QuadraticEquation(1,1,-2);
      QuadraticEquation quadraticEquation_2 = new QuadraticEquation(0,2,-2);
      QuadraticEquation quadraticEquation_3 = new QuadraticEquation(a,b,c);

      quadraticEquation_1.solveEquation();
      quadraticEquation_2.solveEquation();
      quadraticEquation_3.solveEquation();



    }


}
