package gr.aueb.cf.ch8.prct;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyResourceApp {

    public static void main(String[] args) {
        int num = 0;

        try (Scanner in = new Scanner(System.in)){
            num = in.nextInt();
            System.out.println();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
