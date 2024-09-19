package gr.aueb.cf.ch4.xmpls;

import javax.swing.*;

public class SumMulForApp {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            mul *= i;
        }

        System.out.println(sum);
        System.out.println(mul);
    }

}
