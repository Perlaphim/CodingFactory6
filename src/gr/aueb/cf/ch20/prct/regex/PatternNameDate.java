package gr.aueb.cf.ch20.prct.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternNameDate {

    public static void main(String[] args) {
        String s = "12/05/1996";

        Pattern pattern = Pattern.compile("(?<month>\\d{2}/)(?<day>\\d{2}/)(?<year>\\d{4})");
        Matcher matcher = pattern.matcher(s);

        if (matcher.matches()) {
            String month = matcher.group("month");
            String day = matcher.group("day");
            String year = matcher.group("year");
            String out = day + "/" + month + "/" + year;
            System.out.println(out);
        } else {
            System.out.println("Pattern not matches");
        }
    }
}
