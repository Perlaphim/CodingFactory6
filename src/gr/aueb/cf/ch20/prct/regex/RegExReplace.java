package gr.aueb.cf.ch20.prct.regex;

public class RegExReplace {

    public static void main(String[] args) {
        String s = ("Java     Advanced level");

        s = s.replaceAll("\\s+", " ");

        System.out.println(s);
    }
}
