package gr.ergasies.erg7;

public class DecryptApp {

    public static void main(String[] args) {
        String s = "Uif!mfbwft!pg!b!usff";

        String sb = encrypt(s);

        System.out.println(sb); {
        }
    }


    public static String encrypt(String s) {
        StringBuilder sb = new StringBuilder();
        char ch1;
        int ch;
        char ch2;


        for (int i=0; i < s.length(); i++) {
            ch1 = s.charAt(i);
            ch = ch1 - 1;
            ch2 = (char) ch;
            sb.append(ch2);
        }
        return sb.toString();
    }
}
