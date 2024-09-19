package gr.aueb.cf.ch7.prct7;

import java.util.Scanner;

public class StringScan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = null;

        s = sc.next();
        sc.nextLine();
        System.out.println(s);

        s = sc.nextLine();
        System.out.println(s);
    }
}
