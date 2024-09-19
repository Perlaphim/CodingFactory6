package gr.aueb.cf.ch8.prct;

import java.util.Scanner;

public class NumberFormatExceptionStateTestingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        System.out.println("Please insert a String");
        inputStr = in.nextLine();
        if (isInt(inputStr)) {
            num = Integer.parseInt(inputStr);
            System.out.println("Input number: " + num);
        } else {
            System.out.println("Error. Please insert an integer");
        }

    }


    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
