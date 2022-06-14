package Zadanie2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your weight: ");
        float weight = scanner.nextFloat();
        System.out.println("Type your height: ");
        int height = scanner.nextInt();


        BMI bmi_1 = new BMI(88,180);
        BMI bmi_2= new BMI(80,200);
        BMI bmi_3= new BMI(weight,height);

        bmi_1.calculateBMI();
        bmi_2.calculateBMI();
        bmi_3.calculateBMI();







    }
}

