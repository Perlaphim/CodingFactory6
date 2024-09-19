package gr.aueb.cf.ch20.prct.regex;

public class RegExRedOrGreenFirstLetter {

    public static boolean isRedOrGreen(String s) {
        return (s != null) && (s.matches("[Rr]ed|[Gg]reen"));
    }
}