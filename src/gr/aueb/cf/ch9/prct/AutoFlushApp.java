package gr.aueb.cf.ch9.prct;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class AutoFlushApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/fos.txt"), true)){
            ps.println("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
