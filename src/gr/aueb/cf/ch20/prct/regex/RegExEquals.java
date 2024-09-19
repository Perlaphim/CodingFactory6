package gr.aueb.cf.ch20.prct.regex;

public class RegExEquals {

    public static boolean isRed(String s) {
        return (s != null) && (s.matches("Red"));
    }
}
