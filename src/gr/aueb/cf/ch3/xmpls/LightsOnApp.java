package gr.aueb.cf.ch3.xmpls;

import java.util.Scanner;

/**
 * Τα φώτα ενός αυτοκινήτου ανάβουν όταν βρέχει και ταυτόχρονα είτε είναι σκοτάδι
 * ή τρέχει με υψηλή ταχύτητα. Ο χρήστης είσαγει τα παραπάνω στοιχεία και
 * το πρόγραμμα εκτυπώνει αν τα φώτα ανάβουν ή όχι.
 */

public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int speed = 0;
        final int maxSpeed = 100;
        boolean isRaining = false;
        boolean isDark = false;
        boolean areLightsOn = false;

        System.out.println("Εισάγετε αν είναι σκοτεινά: ");
        isDark = in.nextBoolean();

        System.out.println("Εισάγετε αν βρέχει: ");
        isRaining = in.nextBoolean();

        System.out.println("Εισάγετε την ταχύτητα: ");
        speed = in.nextInt();

        areLightsOn = isRaining && (isDark || maxSpeed<speed);

        System.out.println("Τα φώτα είναι αναμμένα: " + areLightsOn);
    }
}
