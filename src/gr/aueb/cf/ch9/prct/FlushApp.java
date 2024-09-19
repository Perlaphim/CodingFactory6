package gr.aueb.cf.ch9.prct;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FlushApp {

    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("C:/tmp/flush-file.txt");
             Scanner in = new Scanner(System.in)){
//            pw.flush();
            System.out.println("Insert something to continue");
            pw.print(in.nextLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
