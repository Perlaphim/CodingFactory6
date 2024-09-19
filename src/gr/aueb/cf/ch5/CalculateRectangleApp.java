package gr.aueb.cf.ch5;

/*
 * Υπολογίζει το εμβαδόν ενός παραλληλόγραμμου
 */

import java.util.Scanner;

public class CalculateRectangleApp {

    public static void main(String[] args) {
        double base = 0.0;
        double height = 0.0;
        double area = 0.0;

        System.out.printf("The area of the rectangle is: %4.2f",calculateArea(base,height,area));
    }

    public static double calculateArea(double base, double height, double area) {
        Scanner in = new Scanner(System.in);
        System.out.println("insert base: ");
        base = in.nextDouble();
        System.out.println("insert height: ");
        height = in.nextDouble();
        return area = base * height;
    }
}
