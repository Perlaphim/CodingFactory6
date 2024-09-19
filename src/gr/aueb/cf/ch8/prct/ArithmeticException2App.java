package gr.aueb.cf.ch8.prct;

import java.util.Scanner;

public class ArithmeticException2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int results = 0;

        while (true) {
            try {
                System.out.println("Please insert a numerator");
                numerator = in.nextInt();
                if (numerator == 0) {
                    break;
                }

                System.out.println("Please insert a denominator");
                denominator = in.nextInt();

                results = numerator / denominator;
                System.out.println(results);
            } catch (ArithmeticException e) {
                System.out.println("Error. Denominator cannot be zero!");
            }
        }
        System.out.println("Thanks for using this app");
    }
}
