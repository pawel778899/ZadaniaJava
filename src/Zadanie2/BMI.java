package Zadanie2;

public class BMI {

    private final float weight;
    private final int height;

    public BMI(float weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public void calculateBMI() {
        double heightInMeters = height / 100.0f;
        double bmi = weight / Math.pow(heightInMeters, 2);

        if(bmi >= 18.5 && bmi <= 24.9) {
            System.out.printf("BMI optymalne - %f%n", bmi);
        } else {
            System.out.printf("BMI nieoptymalne - %f%n", bmi);
        }
    }

}
