package gr.aueb.cf.ch9.prct;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamMethodApp {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:/tmp/cf.txt");
        printMsg(ps, "Hello Coding Plus");                                  //Prints to ps
        printMsg(System.out, "Coding Factory");                             //Print to stdout
    }


    public static void printMsg(PrintStream ps, String message) {
        ps.println(message);
    }
}
