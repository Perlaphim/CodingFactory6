package gr.aueb.cf.ch20.prct.regex;

public class RegExLetterDig {

    public static boolean isRedOrGreen(String s) {
        return (s != null) && (s.matches("\\w\\d"));
    }
}
