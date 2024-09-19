package gr.aueb.cf.ch20.prct.regex;

public class RegExRange2 {

    public static boolean isRedOrGreen(String s) {
        return (s != null) && (s.matches("[a-zA-Z]ing"));
    }
}