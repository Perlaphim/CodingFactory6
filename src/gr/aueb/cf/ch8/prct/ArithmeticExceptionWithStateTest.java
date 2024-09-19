package gr.aueb.cf.ch8.prct;

import java.util.Scanner;

public class ArithmeticExceptionWithStateTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int results = 0;

        while (true) {
                System.out.println("Please insert a numerator");
                numerator = in.nextInt();
                if (numerator == 0) {
                    break;
                }

                System.out.println("Please insert a denominator");
                denominator = in.nextInt();

                if ( isZero(denominator)){
                    System.out.println("Please insert a valid denominator");
                    continue;
                }

                results = numerator / denominator;
                System.out.println(results);
        }
        System.out.println("Thanks for using this app");
    }

    public static boolean isZero(int num) {
        return num == 0;
    }
}
