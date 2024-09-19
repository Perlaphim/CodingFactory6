package gr.aueb.cf.ch3.xmpls;

import java.util.Scanner;

/**
 * υπολογίζει μία απλή διαίρεση.
 * Διαίρεση με μηδέν απαγορεύεται!!!
 */
public class DivApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator, denominator");
        numerator = in.nextInt();
        denominator = in.nextInt();

        if (denominator == 0){
            System.out.println("ERROR! Denominator can not be Zero!");
            System.exit(1);
        }

        if (numerator == 0){
            System.out.println("ERROR! numerator must not be Zero!");
            System.exit(1);
        }

//        if (denominator == 0){
//            System.out.println("ERROR! Denominator can not be Zero!");
//            System.exit(1);
//        }
        result = (numerator / denominator);
        System.out.println("Result: " + result);
    }
}
