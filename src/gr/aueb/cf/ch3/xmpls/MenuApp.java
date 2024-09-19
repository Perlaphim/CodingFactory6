package gr.aueb.cf.ch3.xmpls;

import java.util.Scanner;

/**
 * εμφανίζει ένα μενού επιλογών με Do While.
 * Η Do While εκτελείται τουλάχιστον μία φορά.
 */

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose one of the following: ");
            System.out.println("1.Εισαγωγή (insert) προιόντος");
            System.out.println("2.Ενημέρωση (update) προιόντος");
            System.out.println("3.Διαγραφή (delete) προιόντος");
            System.out.println("4.Αναζήτηση (select) προιόντος");
            choice = in.nextInt();
        } while (choice != 0);

        System.out.println("Thank you for using our app!");
    }
}
