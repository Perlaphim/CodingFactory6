package gr.aueb.cf.ch4.xmpls;

/*
 * Γενική μορφή της for
 */

import java.util.Scanner;

public class GenericForApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step = 0;
        int iterations = 0;

        System.out.println("Please insert");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endValue; i += step) {
            iterations++;
            System.out.println("i = " + i + " ");
        }

        System.out.println("Iterations: " + iterations);
    }
}
