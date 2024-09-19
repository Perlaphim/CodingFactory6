package gr.aueb.cf.ch9.prct;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterApp {

    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("C:/tmp/fw.txt")){
            pw.println("Hello World");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
