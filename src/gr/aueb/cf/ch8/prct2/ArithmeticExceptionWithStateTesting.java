package gr.aueb.cf.ch8.prct2;

import java.util.Scanner;

public class ArithmeticExceptionWithStateTesting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert a numerator and a denominator: ");
            numerator = in.nextInt();
            denominator = in.nextInt();

            if (isZero(denominator)) {
                System.out.println("denominator cannot be zero");
                System.out.println();
                continue;
            }

            result = numerator / denominator;
            System.out.printf("%d / %d = %d\n", numerator, denominator, result);

            if (numerator == 0) {
                break;
            }
        }

        System.out.println("Thanks for using our App");
    }

    private static boolean isZero(int num) {
        return num == 0;
    }
}
