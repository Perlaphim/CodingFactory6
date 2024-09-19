package gr.aueb.cf.ch5;

/*
 * Ελέγχει αν ένας ακέραιος είναι άρτιος ή όχι.
 */

import java.util.Scanner;

public class IsEvenApp {

    public static void main(String[] args) {
        int num = 0;

        isEven(num);
    }


    public static void isEven(int num){
        Scanner in = new Scanner(System.in);

        System.out.println("Insert a number:");
        num = in.nextInt();

        if (num % 2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}
