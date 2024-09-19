package gr.ergasies.erg14.ask2;

public class ValidationUtils {
    private ValidationUtils() {}

    public static boolean validateArr(int[] arr) {
        if (arr.length >= 1 && arr.length <= 10) {
            return true;
        }
        return false;
    }

    public static boolean validateString(String s) {
        if (s.toCharArray().length >= 1 && s.toCharArray().length <= 31) {
            return true;
        }
        return false;
    }
}
