package gr.aueb.cf.ch3.xmpls;

import java.util.Scanner;

/** Διαβάζει μία θερμοκρασία (μία ακέραια τιμή)
 * από το στάνταρτ ίνπουτ καθώς και μία τίμη Boolean
 * που αντιστιχεί στο αν βρέχει και αποφασίζει αν χιονίζει.
 */

public class SnowingApp {

    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);
        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Please insert if it's raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it's snowing");
        temp = in.nextInt();

        isSnowing = isRaining && (temp<0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
