package gr.aueb.cf.ch3.xmpls;

import java.util.Scanner;

/**
 * υπολογίζει το παραγοντικό το n
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert num");
        num = in.nextInt();

        while (i <= num) {
            facto *= i;
            i++;
        }

        System.out.printf("%d! = %,d", num, facto);
    }

}
