package gr.aueb.cf.ch3.xmpls;

import java.util.Scanner;

/**
 * Συνεχίζει το διάβασμα μέχρι να δοθεί μια ειδική τιμή Sentinel
 */
public class SentinelApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please insert a num (-1 for exit)");
        //num = in.nextInt();

        while ((num = in.nextInt()) != -1){
            iterations++;
            System.out.println("Please insert a num (-1 for exit)");
            // num = in.nextInt();
        }
    }
}
