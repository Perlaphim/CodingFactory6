package gr.aueb.cf.ch4.xmpls;

public class UnicodeApp {

    public static void main(String[] args) {
        int smilie = 0x1F600;

        System.out.println("Smilie: ");
        System.out.println(Character.toChars(smilie));
    }
}
