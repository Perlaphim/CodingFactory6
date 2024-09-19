package gr.aueb.cf.ch3.xmpls;

import java.util.Scanner;

/**
 * υπολογίζει δυνάμεις
 */

public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputbase = 0;
        int inputpower = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please insert base (integer):");
        inputbase = in.nextInt();

        System.out.println("Please insert power (integer):");
        inputpower = in.nextInt();

        while (i <= inputpower) {
            result *= inputbase;
            i++;
        }

        System.out.printf("%d ^ %d = %,d\n", inputbase, inputpower, result);
    }
}
