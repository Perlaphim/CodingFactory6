package gr.aueb.cf.ch5;

public class SumOfDigitsApp {

    public static void main(String[] args) {
        int num = 123434;
        int sumOfDigits = 0;

        sumOfDigits = getSumOfDigits(num);
        System.out.println(sumOfDigits);
    }


    public static int getSumOfDigits(int num) {
        int left = num;
        int rightDigit = left % 10;
        int sum = 0;


        do {
            rightDigit = left % 10;
            sum += rightDigit;
            left /= 10;

        }while (left != 0);
        return sum;
    }
}
