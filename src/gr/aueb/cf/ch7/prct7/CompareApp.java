package gr.aueb.cf.ch7.prct7;

public class CompareApp {

    public static void main(String[] args) {
        String s1 = "athens";
        String s2 = "ATHENS";

        if (s1.compareTo(s2) < 0) System.out.println("BINGO");
        if (s1.compareTo(s2) > 0) System.out.println("BANGO");
        if (s1.compareTo(s2) == 0) System.out.println("BONGO");
    }
}
