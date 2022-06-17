package Zadanie5;

public class PrimeNumbers {

    private final int number;

    public PrimeNumbers(int number) {
        this.number = number;
    }

    void writePrimeNumbers() {
        for (int i = 2; i <= number; i++) {
            if (isPrimeNumber_optimalization_sqrt_2(i)) {
                System.out.print(i + "  ");
            }
        }
    }

    private boolean isPrimeNumber(int number) {

        boolean isPrimeNumber = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }

    private boolean isPrimeNumber_optimalization_1(int number) {

        boolean isPrimeNumber = true;

        for (int i = 2; i < (number / 2) + 1; i++) {

            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }

    private boolean isPrimeNumber_optimalization_sqrt_2(int number) {

        boolean isPrimeNumber = true;

        for (int i = 2; i < Math.sqrt(number); i++) {

            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }


}