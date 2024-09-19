package gr.ergasies.erg8;

import java.io.IOException;
import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        int num = 0;

        while (true) {
            getMenu(num);
            num = getChoice(num);
            if (num == 5) {
                System.out.println("Exit");
                break;
            }
            try {
                printChoice(num);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice");
            }
        }
    }

    public static void getMenu(int num) {

            System.out.println("Please choose one of the following options: ");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5. Exit");

    }

    public static int getChoice(int num) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter an integer");
            if (num == 5) {
                break;
            }
            if (in.hasNextInt()) {
                num = in.nextInt();
                break;
            } else {
                System.out.println("Error. Please enter a valid integer");
                in.nextLine();
            }
        }
        System.out.println("Your chose the option: " + num);
        return num;
    }

    public static void printChoice(int choice) throws IllegalArgumentException {

        try {
            if ((choice < 1) || (choice > 5)) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
