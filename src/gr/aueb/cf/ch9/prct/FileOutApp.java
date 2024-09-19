package gr.aueb.cf.ch9.prct;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileOutApp {

    public static void main(String[] args) {
        File fdIn = new File("C:/tmp/file6.txt");
        File fdOut = new File("C:/tmp/file6out.txt");

        try ( Scanner in = new Scanner(fdIn);
              PrintWriter pw = new PrintWriter(fdOut, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] tokens = line.split(" ");

                for (String token : tokens) {
                    pw.printf("%s: ", token);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
