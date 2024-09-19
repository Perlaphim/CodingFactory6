package gr.aueb.cf.ch3.xmpls;

import java.util.Scanner;
/**
 *  Ο χρήστης δίνει το n, ώστε να υπολογιστεί
 *  το 1+2+3+...+n και το 1*2*3*...*n
 */
public class GenericSumMulApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = 0;
        int sum = 0;
        int mul = 1;

        System.out.println(" Please insert n: ");
        n = in.nextInt();

        while (i <= n){
            sum += i;
            mul *= i;
            System.out.println("το sum είναι: " + sum + " και το mul είναι: " + mul);
            i++;
    }
    }
}
