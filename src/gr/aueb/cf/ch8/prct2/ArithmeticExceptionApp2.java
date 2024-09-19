package gr.aueb.cf.ch8.prct2;

import java.util.Scanner;

public class ArithmeticExceptionApp2 {

    public static void main(String[] args) {
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.println("Please insert a numerator (0 for quit) and a denominator: ");
                numerator = in.nextInt();
                if (numerator == 0) {
                    break;
                }
                denominator = in.nextInt();
                result = result + numerator / denominator;
                System.out.printf("%d / %d = %d", numerator, denominator, result);
            } catch (ArithmeticException e) {
                System.out.println("denominator cannot be zero");
            }
        }

    }
}
