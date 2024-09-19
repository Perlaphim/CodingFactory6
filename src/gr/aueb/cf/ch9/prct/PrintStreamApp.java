package gr.aueb.cf.ch9.prct;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/f1.txt")){
            ps.println("Hello Coding Factory");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
