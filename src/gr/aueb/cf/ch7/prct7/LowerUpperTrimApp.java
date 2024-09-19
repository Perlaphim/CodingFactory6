package gr.aueb.cf.ch7.prct7;

public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String s = "Athens University Of Economics and Business     ";
        String lowercase;
        String uppercase;
        String trim;

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trim = s.trim();

        System.out.println(lowercase);
        System.out.println(uppercase);
        System.out.println(trim);
    }
}
