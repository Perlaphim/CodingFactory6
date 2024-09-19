package gr.aueb.cf.ch3.prctc;

import java.util.Scanner;

public class SavingsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX_NUMBER = 1000;
        int allSavings = 0;
        boolean wage = false;
        final int UNUSED = 200;
        final int USED = 500;

        while (allSavings < MAX_NUMBER) {

            System.out.println("Πληρωθήκατε αυτό το μήνα;");
            wage = in.nextBoolean();

            if (wage == true){
                allSavings += UNUSED;
                System.out.println("Your balance is: "+ allSavings);
            } else if (wage == false) {
                allSavings -= USED;
                System.out.println("Your balance is: "+ allSavings);
            }
        }
        System.out.println("Συγχαρητήρια");
    }
}
