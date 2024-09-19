package gr.aueb.cf.ch2.xmpls;

import java.util.Scanner;

public class EuroToUSConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int euros = 0;
        int dollars = 0;
        int totalCents = 0;
        int remainingCents = 0;
        final int US_PARITY = 99;


        System.out.println("Please insert the ammount in Euro");
        euros = in.nextInt();

        totalCents = euros * US_PARITY;
        dollars = totalCents / 100;
        remainingCents = totalCents % 100;

        System.out.printf("%,d total euros = %,d cents = %,d dollars and %,d cents",
                euros, totalCents, dollars, remainingCents);
    }
}
