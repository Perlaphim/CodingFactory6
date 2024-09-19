package gr.aueb.cf.ch3.xmpls;

import java.util.Scanner;

/**
 * υπολογίζει το πλήθος των ψηφίων ενός ακέραιου με Do While
 * πχ. το ψηφίο 259 έχει τρια ψηφία.
 */
public class DigitCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int copyOfNum = 0;
        int count = 0;
        int sumOfDigits = 0;
        int rhDigits = 0;

        System.out.println("Please insert num:");
        num = in.nextInt();
        copyOfNum = num;

        do{
            count++;
            rhDigits = copyOfNum % 10;
            sumOfDigits += rhDigits;

            copyOfNum /= 10;
        } while (copyOfNum != 0);

        System.out.printf("Ο αριθμός των ψηφίων είναι %d\n", count);
        System.out.printf("Ο αριθμός των ψηφίων είναι %d", sumOfDigits);
    }
}
