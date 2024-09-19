package gr.aueb.cf.ch20.prct.regex;

public class RegExBackReference {

    public static void main(String[] args) {
        String s = ("Pavlos Hatzigeorgiou");

        s = s.replaceAll("(.*)\\s(.*)", "$2 $1");
        System.out.println(s);
    }
}
