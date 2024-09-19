package gr.aueb.cf.ch5;

/*
 * υπολογίζει το παραγοντικό n με τη χρήση facto(n)
 */

import java.util.Scanner;

public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int a = 2;
        int b = 10;

        System.out.println("Please insert n");
        n = in.nextInt();

        System.out.printf("%d! = %d\n", n, facto(n));
        System.out.printf("%d^%d = %d", a, b, pow(a,b));
    }


    /**
     * Iterative version of n!
     *
     * @param n   the input number n
     * @return    the factorial of n
     */

    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }

    /**
     * Power a^b
     *
     * @param a
     * @param b
     * @return
     */

    public static int pow(int a, int b) {
        int power = 1;

        for (int j = 1; j <= b; j++) {
            power *= a;
        }
    return power;
    }
}
