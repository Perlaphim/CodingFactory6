package gr.aueb.cf.ch3.Erg3;

import java.util.Scanner;

public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int isLeapYear = 0;

        while (true) {
            System.out.println("Please insert a year: ");
            year = in.nextInt();


            if ((year % 4 == 0) && !(year % 100 == 0)) {
                isLeapYear = year;
                System.out.println("The year " + isLeapYear + "is a leap year!!");
                break;

            } else if ((year % 400) == 0) {
                isLeapYear = year;
                System.out.println("The year " + isLeapYear + " is a leap year!!");
                break;
            }

            System.out.println("The year is not a leap year!");
        }
    }
}
