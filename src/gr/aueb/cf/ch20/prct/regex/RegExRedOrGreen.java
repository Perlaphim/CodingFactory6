package gr.aueb.cf.ch20.prct.regex;

public class RegExRedOrGreen {

    public static boolean isRedOrGreen(String s) {
        return (s != null) && (s.matches("Red|Green"));
    }
}
