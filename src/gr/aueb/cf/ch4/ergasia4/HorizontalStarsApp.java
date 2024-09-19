package gr.aueb.cf.ch4.ergasia4;

import java.util.Scanner;

public class HorizontalStarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfStars = 0;

        System.out.println("please insert the number of stars: ");
        numOfStars = in.nextInt();

        for (int i=1; i<=numOfStars; i++) {
            System.out.print("*");
        }
    }
}
