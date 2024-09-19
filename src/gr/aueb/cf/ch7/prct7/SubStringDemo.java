package gr.aueb.cf.ch7.prct7;

public class SubStringDemo {

    public static void main(String[] args) {
        String s = "This is AUEB";

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(i,i+1));
        }
    }
}
