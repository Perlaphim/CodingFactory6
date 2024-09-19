package gr.aueb.cf.ch4.ergasia4;

import java.util.Scanner;

public class nStarsDesc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert a number");
        num = in.nextInt();

        for (int i=1; i<=num; i++) {
            for (int j=num; j>=i; j--) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}