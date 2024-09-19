package gr.aueb.cf.ch8.prct2;

import java.util.Scanner;

public class ArithmeticExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert a numerator and a denominator: ");
        numerator = in.nextInt();
        denominator = in.nextInt();
        result = numerator / denominator;
        System.out.println("The result is: " + result);
        System.out.printf("%d / %d = %d\n", numerator, denominator, result);
    }
}
