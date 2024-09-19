package gr.aueb.cf.ch5;

/**
 * Ο χρήστης δίνει μία ακολουθία ακεραίων
 * που τελειώνει με το 0 και το πρόγραμμα υπολογίζει
 * το min,max,avg
 */

import java.util.Scanner;

public class MinMaxAvgApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        int average = 0;
        int sum = 0;

        System.out.println("insert a sequence of integers (0 for end)");

        while ((num=in.nextInt()) !=0) {

            if (num<min){
                min = num;
            }

            if (num>max){
                max = num;
            }

            sum += num;
            count++;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Average: %.2f", ((double) sum/count));
    }
}
