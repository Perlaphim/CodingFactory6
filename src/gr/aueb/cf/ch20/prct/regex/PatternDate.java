package gr.aueb.cf.ch20.prct.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDate {

    public static void main(String[] args) {
        String s = "11/07/2000";

//        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{1})/(\\d{4})");
        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");
        Matcher matcher = pattern.matcher(s);

        if (matcher.matches()) {
            String month = matcher.group(1);
            String year = matcher.group(2);
            String day = matcher.group(3);
            String out = day + "/" + month + "/" + year;
            System.out.println(out);
        } else {
            System.out.println("Pattern not matches");
        }
    }
}
