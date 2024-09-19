package gr.aueb.cf.ch8.prct;

import java.util.Scanner;

public class NumberFormatExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        try {
            System.out.println("Please insert a String");
            inputStr = in.nextLine();
            num = Integer.parseInt(inputStr);
            System.out.println("Input number: " + num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
