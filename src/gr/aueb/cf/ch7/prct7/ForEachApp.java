package gr.aueb.cf.ch7.prct7;

public class ForEachApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

       for (char ch : s.toCharArray()) {
           System.out.print(ch + " ");
       }

        System.out.println("\u2764");
    }
}
