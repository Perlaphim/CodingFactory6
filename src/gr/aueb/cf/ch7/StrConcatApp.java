package gr.aueb.cf.ch7;

/*
 * Demo of Concat
 */
public class StrConcatApp {
    public static void main(String[] args) {

        String s1 = "Cosing";
        String s2 = "Factory";

        String s3 = s1+s2;
        String s4 = s1.concat(s2);
        String s5 = s1 + " " + s2;
        String s6 = s1.concat(" ").concat(s2);       //s3 = s4 = s5 =s6

        System.out.println("s3: " + s3);
        System.out.println("s4: " + s4);
        System.out.println("s5: " + s5);
        System.out.println("s6: " + s6);

    }
}
