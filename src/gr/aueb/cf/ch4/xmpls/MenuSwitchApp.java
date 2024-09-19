package gr.aueb.cf.ch4.xmpls;

import java.util.Scanner;

/*
 * εκτυπωνει ένα μενου επιλογων και αναλογα
 * με την επιλογη του χρηστη δινει feedback
 */
public class MenuSwitchApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("Επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. One-player game");
            System.out.println("2. Two-player game");
            System.out.println("3. Team game");

            choice = in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Start One-player game");
                    break;
                case 2:
                    System.out.println("Start Two-player game");
                    break;
                case 3:
                    System.out.println("Start Team game");
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        }while (choice != 0);
    }
}
