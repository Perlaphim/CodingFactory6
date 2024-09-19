package gr.aueb.cf.ch3.prctc;

import java.util.Scanner;

public class InsertNumberApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberStars = 0;
        int num = 1;

        System.out.println("Παρακαλώ εισάγετε εναν αριθμό: ");
        numberStars = in.nextInt();

        while (num <= numberStars) {
            System.out.print("*");
            num++;
        }
    }
}
