package gr.aueb.cf.ch10.prct;

import java.util.Scanner;

public class UpperLowerCaseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String sentence;
        char ch;

        System.out.println("Please insert a String");
        sentence = in.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            ch = sentence.charAt(i);
            if (Character.isLetter(ch)) {
                ch = ((i % 2) == 0) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                sb.append(ch);
            }
        }

        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i));
        }
    }
}
