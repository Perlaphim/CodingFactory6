package gr.aueb.cf.ch4.xmpls;

/*
 * Demo or Reading input
 * 1. System in.read(); -> int
 */


import java.io.IOException;
import java.util.Scanner;


public class CharReadApp {

    public static void main(String[] args) throws IOException {
        int inputChar1 = ' ';
        char inputChar2= ' ';
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert a ASCII char");
        inputChar1 = System.in.read();

       System.out.println("Ordinal: " + inputChar1);
       System.out.println("Char: " + (char) inputChar1);

        System.out.println("please insert a unicode char");
        inputChar2 = in.nextLine().charAt(0);
        System.out.println("Unicode char: " + inputChar2);
    }
}
