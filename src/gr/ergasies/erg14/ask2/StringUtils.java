package gr.ergasies.erg14.ask2;

public class StringUtils {

    private StringUtils() {}

    public static String reverseString(String arr) {
        String reversed = "";
        char ch;
        for (int i=arr.length()-1; i>=0; i--) {
            ch = arr.charAt(i);
            reversed += ch;
        }
        return reversed;
    }

    public static String UppercaseString(String arr) {
        String uppercase = "";
        char ch;
        for (int i=arr.length()-1; i>=0; i--) {
            ch = arr.charAt(i);
            ch = Character.toUpperCase(ch);
            uppercase += ch;
        }
        return uppercase;
    }

    public static boolean isRegressingString(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
