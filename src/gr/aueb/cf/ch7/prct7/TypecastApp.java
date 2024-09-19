package gr.aueb.cf.ch7.prct7;

import java.util.Scanner;

public class TypecastApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lexeme;
        int num;

        System.out.print("Please insert an Int: ");
        lexeme = in.next();
        num = Integer.parseInt(lexeme);

        System.out.println(num);
    }
}
