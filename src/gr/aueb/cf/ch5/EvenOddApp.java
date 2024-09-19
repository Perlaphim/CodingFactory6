package gr.aueb.cf.ch5;

/*
 * Ελέγχει αν ένας ακέραιος είναι άρτιος ή περιττός
 * με τη χρήση μεθόδων
 */

import java.util.Scanner;

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert a num");
        inputNum = in.nextInt();

        System.out.printf("%d is even: %b%n", inputNum, isEven(inputNum));
        System.out.printf("%d is even: %b", inputNum, !isEven(inputNum));
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }
}
