package gr.aueb.cf.ch20.prct.regex;

public class RegExEmail {

    public static boolean isValidEmail(String s) {
        return (s != null) && (s.matches("\\w*\\.?\\w+@\\w+\\.(com|gr)"));
    }
}
