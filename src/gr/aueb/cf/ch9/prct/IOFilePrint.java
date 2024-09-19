package gr.aueb.cf.ch9.prct;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class IOFilePrint {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/IOSimpleTest1.txt");
             PrintWriter pw = new PrintWriter("C:/tmp/IOSimpleTest2.txt")) {

            ps.println("Hello World2! from PrintStream");
            pw.println("Hello World2! from PrintWriter");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
