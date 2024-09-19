package gr.aueb.cf.ch5;

/*
 * Ελέγχει αν το τρίγωνο είναι ορθογώνιο.
 * Ο χρήστης εισάγει τρεις δεκαδικούς που
 * αναπαρηστούν τις πλευρές ενός τριγώνου.
 */

import java.util.Scanner;

public class RightTriangeApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.0000005;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        boolean isRight = false;

        System.out.println("Παρακαλώ εισάγετε τρεις πλευρές");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = Math.abs(a*a - b*b - c*c) <= EPSILON;
        System.out.println("Triangle is Right: " + isRight);
    }
}
