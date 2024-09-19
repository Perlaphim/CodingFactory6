package gr.aueb.cf.ch3.xmpls;

import java.util.Scanner;

/**
 * Διαβάζει από το χρήστη ένα ακέραιο που συμβολίζει θερμοκρασία
 *και ελέγχει αν είναι μικρότερη από το μηδέν.
*Εκτυπώνει το αποτέλεσμα
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero = false;

        System.out.println("Please insert the temperature: (integer)");
        temp = in.nextInt();

        isTempBelowZero = temp < 0;

        System.out.println("Temp is below zero: " + isTempBelowZero);
    }
}
