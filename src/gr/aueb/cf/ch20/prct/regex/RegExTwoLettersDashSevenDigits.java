package gr.aueb.cf.ch20.prct.regex;

public class RegExTwoLettersDashSevenDigits {

    public static boolean isTwoLettersDashSevenDigits (String s) {
        return (s != null) && (s.matches("[A-Z]{2}-\\d{7}"));
    }
}
