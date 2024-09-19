package gr.aueb.cf.ch20.prct.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternIntersection {

    public static void main(String[] args) {
        String s = "A13:D456:X55:H78:";

        Pattern pattern = Pattern.compile("[A-Z&&[ADX]].*?:");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
