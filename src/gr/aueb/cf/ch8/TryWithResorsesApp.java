package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResorsesApp {

    public static void main(String[] args) {
        int num = 0;

        try (Scanner in = new Scanner(System.in)){
            num = in.nextInt();
        }catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
