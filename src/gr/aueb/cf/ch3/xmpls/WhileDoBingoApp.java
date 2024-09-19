package gr.aueb.cf.ch3.xmpls;

import java.util.Scanner;

public class WhileDoBingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int secret = 30;
        int num = 0;

        while (true){
            System.out.println("Please insert the num and guess the secret!");
            num = in.nextInt();

            if (num==secret){
                System.out.println("Bingo!!!");
                break;
            }

            System.out.println("Try Again!");
        }

        System.out.println("Thank you for playing the game!");
    }
}
