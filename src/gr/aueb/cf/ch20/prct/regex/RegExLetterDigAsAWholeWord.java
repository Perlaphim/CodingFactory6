package gr.aueb.cf.ch20.prct.regex;

public class RegExLetterDigAsAWholeWord {

    public static boolean isLetterDigAsAWholeWord(String s) {
        return (s != null) && (s.matches(".*\\b\\w\\d\\b.*"));
    }
}
