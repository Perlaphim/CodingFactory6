package gr.aueb.cf.ch20.prct.regex;

public class RegExAnyCharSpaceDig {

    public static boolean isRedOrGreen(String s) {
        return (s != null) && (s.matches(".\\s\\d"));
    }
}
