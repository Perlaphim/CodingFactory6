package gr.aueb.cf.ch4.ergasia4;

import java.util.Scanner;

public class nxnStarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("please insert the number of stars: ");
        num = in.nextInt();

        for (int i=1; i<=num; i++) {
            for (int j=1; j<=num; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
