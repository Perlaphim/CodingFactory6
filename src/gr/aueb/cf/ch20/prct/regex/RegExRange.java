package gr.aueb.cf.ch20.prct.regex;

public class RegExRange {

    public static boolean isRedOrGreen(String s) {
        return (s != null) && (s.matches("[A-Z]ing"));
    }
}
