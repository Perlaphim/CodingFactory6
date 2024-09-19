package gr.aueb.cf.ch6.prct6B;

public class Predicates {

    public static boolean moreThanTwoConsecutives(int[] arr) {

        if (arr == null) return false;
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] == arr[i+1] - 1) && (arr[i] == arr[i+2] - 2)) {
                count++;
            }
        }
        return count >= 1;
    }

}
