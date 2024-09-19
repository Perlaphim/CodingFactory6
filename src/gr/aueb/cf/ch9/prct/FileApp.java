package gr.aueb.cf.ch9.prct;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class FileApp {

    public static void main(String[] args) {
        File fd = new File("C:/tmp/file6.txt");

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] tokens = line.split(" ");

                for (String token : tokens) {
                    System.out.printf("%s ",token);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}