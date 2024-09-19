package gr.aueb.cf.ch8.prct;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        while (true) {
            try {
                System.out.println("Please insert a number (integer)");
                inputNum = in.nextInt();
                if (inputNum == 12) break;
                System.out.println("Input number: " + inputNum);

            } catch (InputMismatchException e) {
                in.nextLine();
//              e.printStackTrace();
                System.out.println("Error in input, please insert an int");
            }
        }
    }
}
