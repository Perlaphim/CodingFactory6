package gr.aueb.cf.ch2.erg2;

import java.util.Scanner;

public class InputDateApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputDay = 0;
        int inputMonth = 0;
        int inputYear = 0;

        System.out.println("Εισάγεται τη μέρα: ");
        inputDay = in.nextInt();

        System.out.println("Εισάγεται το μήνα: ");
        inputMonth = in.nextInt();

        System.out.println("Εισάγεται τη χρονία: ");
        inputYear = in.nextInt();

        System.out.printf("Η ημέρομηνία που καταχωρήθηκε είναι: %02d/%02d/%d", inputDay, inputMonth, inputYear);
    }
}
