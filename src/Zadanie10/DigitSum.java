package Zadanie10;

public class DigitSum {
    private  final int number;

    public DigitSum(int number) {
        this.number = number;
    }
    public int fastSumDigit() {
        int sum = 0;
        int n = number;
        do {
            sum = sum + n % 10; // 123%10=3, 12%10=2, 1%10=1 i tak dla każdego modulo 2%10=2 itd.
            n = n / 10;
        } while (n != 0);
        return sum;
    }

    public int notOptimalSumDigits() {
        int result = 0;
        double nextDigit;
        int i = 0;
        do {
            nextDigit = (number / Math.pow(10, i));
            int box = (int) nextDigit % 10;
            result = result + box;
            i++;
        } while (nextDigit > 0);

        return result;
    }
    public int oopSumDigits() {
        String textNumber  = String.valueOf(number); // Returns the string representation of the int argument.
        String[] array = textNumber.split("");
        int result = 0;
        //pętla for each, iteruje przez wszystkie elementy
        for (String s : array) {
            result = result + Integer.parseInt(s);
        }
        return result;
    }


}
