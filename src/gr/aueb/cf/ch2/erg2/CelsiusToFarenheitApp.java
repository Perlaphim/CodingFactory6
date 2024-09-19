package gr.aueb.cf.ch2.erg2;

import java.util.Scanner;

public class CelsiusToFarenheitApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputFahrenheit = 0;
        int celsius = 0;

        System.out.println("Εισάγεται τη θερμοκρασία σε Φαρενάιτ: ");
        inputFahrenheit =  in.nextInt();

        celsius = 5 * (inputFahrenheit - 32) / 9;

        System.out.printf("Η ακέραια θερμοκρασία σε βαθμούς Κελσίου είναι: %d", celsius);

    }
}
