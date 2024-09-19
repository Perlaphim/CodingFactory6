package gr.aueb.cf.ch8;

import java.io.IOException;

public class MethodsExceptionApp {

    public static void main(String[] args) {
        char ch = ' ';
        try {
            ch = readOneChar();
        }catch (IOException e) {
            System.out.println("Error. Can not read a char.");
        }
    }

    public static char readOneChar() throws IOException {
        try {
            return (char) System.in.read();
        }catch (IOException e){
            System.err.println(e.getMessage());
            throw e;
        }
    }
}
