package gr.aueb.cf.ch5;

/*
 * Διαβάζει διαδοχικα λεξεις και κενα.
 * Μέχρι να βρει το χαρακτήρα #
 */

import java.io.IOException;

public class ReadWordsApp {

    static boolean isHash = false;
    static char ch = ' ';

    public static void main(String[] args) throws IOException {

        do {
            consumeWord();
            System.out.println();
            consumeSpaces();
        }while (!isHash);

    }

    public static void consumeWord() throws IOException {
        while ((ch = (char) System.in.read()) != ' '){
            if (ch == '#') {
                isHash = true;
                break;
            }
            System.out.print(ch + " ");
        }
    }

    public static void consumeSpaces() throws IOException {
        while ((ch = (char) System.in.read()) == ' ') {
            if (ch == '#') {
                isHash = true;
            }

        }
        if (!isHash) System.out.print(ch + " ");
    }
}
