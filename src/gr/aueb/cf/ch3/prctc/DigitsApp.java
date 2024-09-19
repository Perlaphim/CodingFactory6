package gr.aueb.cf.ch3.prctc;

import java.util.Scanner;

public class DigitsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int ch = 0;
        int sum = 0;
        int res1 = 0;
        int res2 = 0;
        int res3 = 0;
        int mod = 0;
        int sub = 0;
        int mul = 1;
        int max = 0;
        int min = 0;
        int abs = 0;
        int div = 0;


        System.out.println("please submit a number");
        num = in.nextInt();

        res1 = num / 100;
        mod = num % 100;
        res2 = mod / 10;
        res3 = mod % 10;

        do {
            System.out.println("please submit your choice");
            ch = in.nextInt();

             if (ch == 1) {
                 sum = res1 + res2 + res3;
                 System.out.println(sum);

             } else if (ch == 2) {
                 mul = res1 * res2 * res3;
                 System.out.println(mul);

             } else if (ch == 3) {
                 sub = res1 - res2 - res3;
                 System.out.println(sub);

             } else if (ch == 4) {
                 System.out.println(Math.max(res1, Math.max(res2, res3)));

             } else if (ch == 5) {
                 System.out.println(Math.min(res1, Math.min(res2, res3)));

             } else if (ch == 6) {
                 abs = (num > 0) ? num : -num;
                 System.out.println(abs);

             }else if (ch == 7) {
                if (res2!=0 && res3!=0) {
                    div = (res1 / res2) / res3;
                    System.out.println(div);
                }
                 System.out.println("Can't run");

             }else if (ch>7 | ch<0) {
                 System.out.println("Try another option between 1 and 5");

             }
        }while (ch != 0);

        System.out.println("Έξοδος");
    }
}
