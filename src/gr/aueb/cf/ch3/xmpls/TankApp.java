package gr.aueb.cf.ch3.xmpls;

import java.util.Scanner;

/**
 * λαμβάνει true/false από το standart input για δύο δεξαμενες.
 * Αν και οι δύο έχουν καύσιμα μίκροτερο από ένα τέταρτο
 * τότε ανάβει κόκκινο, ένω αν έχει μόνο η μία ανάβει πορτοκαλί
 */

public class TankApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isLessThanQuarterTank1 = false;
        boolean isLessThanQuarterTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert if Tank1 is less than Quarter");
        isLessThanQuarterTank1 = in.nextBoolean();
        System.out.println("Please insert if Tank2 is less than Quarter");
        isLessThanQuarterTank2 = in.nextBoolean();

        isOrange = isLessThanQuarterTank1 ^ isLessThanQuarterTank2;
        isRed = isLessThanQuarterTank1 && isLessThanQuarterTank2;

        System.out.println(isOrange);
        System.out.println(isRed);

        System.out.println();
    }
}
