package gr.aueb.cf.ch20.prct.regex;

public class RegExSplit {

    public static void main(String[] args) {
        String s = "Java    Advanced level";

        String[] tokens = s.split("\\s+");
    }
}
