package gr.aueb.cf.ch2.xmpls;

import java.util.Scanner;

public class DateToSecondsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SEC_PER_MINUTE = 60;
        final int SEC_PER_HOUR = 60 * 60;
        final int SEC_PER_DAY = 60 * 60 * 60;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int totalSec = 0;
        int totalSec1 = 0;
        int totalSec2 = 0;
        int totalSec3 = 0;



        System.out.println("Please insert total Days");
        days = in.nextInt();

        System.out.println("Please insert total Hours");
        hours = in.nextInt();

        System.out.println("Please insert total Minutes");
        minutes = in.nextInt();


        totalSec1 = days / SEC_PER_DAY;

        totalSec2 = hours / SEC_PER_HOUR;

        totalSec3 = minutes / SEC_PER_MINUTE;

        totalSec = totalSec1 + totalSec2 + totalSec3;

        System.out.printf("Total seconds: %,d ", totalSec);
    }
}