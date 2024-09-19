package gr.aueb.cf.ch7.prct7;

import java.util.Scanner;

public class StringInputApp {

    /**
     *              reads strings from the standard input
     * @param args
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;


        System.out.println("Please insert a string that ends in a whitespace (enter/tab/space)");
        s = sc.next();
        sc.nextLine();          // consumes the new line character(s)
        System.out.println(s);


        System.out.println("Please insert a string that ends with enter");
        s = sc.nextLine();
        System.out.println(s);
    }
}
