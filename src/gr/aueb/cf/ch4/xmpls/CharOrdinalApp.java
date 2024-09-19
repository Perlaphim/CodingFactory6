package gr.aueb.cf.ch4.xmpls;
/*
 *  εκτιπώνει χαρακτ και το ordinal number (code point)
 */
public class CharOrdinalApp {

    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = '#';

        System.out.printf("Char: %c, ordinal: %d\n", ch1, (int) ch1);
        System.out.printf("Char: %c, ordinal: %d", ch2, (int) ch2);
    }
}
