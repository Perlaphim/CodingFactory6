package gr.aueb.cf.ch20.prct.regex;

public class RegExLetterDigAnywhere {

    public static boolean isLetterDigAnywhere(String s) {
        return (s != null) && (s.matches(".*\\w\\d.*"));
    }
}
