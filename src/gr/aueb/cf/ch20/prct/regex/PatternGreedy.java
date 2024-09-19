package gr.aueb.cf.ch20.prct.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternGreedy {

    public static void main(String[] args) {
        String s = "login:Pavlos;pass:123456;";

        Pattern pattern = Pattern.compile(".*;");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
