package gr.aueb.cf.ch3.xmpls;

import java.util.Scanner;

/**
 * Ο χρήστης μαντεύει
 * ένα μυστικό αριθμό (Secret).
 */

public class BingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int secret = 12;
        int num = 0;
        boolean isBingo = false;

        do {
            System.out.println("Please insert num:");
            num = in.nextInt();

            if (num == secret) {
            System.out.println("Bingo!!!");
            isBingo = true;
            } else {
            System.out.println("Try Again!");
            }
        }while (!isBingo);
    }
}
