package gr.aueb.cf.ch8.prct;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) throws FileNotFoundException {
        int num = 0;
        File fd = new File("C:\\tmp\\helo.txt");

        try (Scanner in = new Scanner(System.in)){
            num = in.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
