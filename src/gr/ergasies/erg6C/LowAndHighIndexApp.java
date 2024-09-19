package gr.ergasies.erg6C;

import java.util.Arrays;

public class LowAndHighIndexApp {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        final int KEY = 6;
        int[] highLow;

        highLow =  getLowAndHighIndexOf(arr,KEY);

        for (int item : highLow) {
            System.out.print(item + " ");
        }
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = 0;
        int[] lowHigh = new int[2];

        if (arr == null ) return null;

        lowHigh[0] = low;
        lowHigh[1] = arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < key) {
                low++;
                break;
            } else {
                return null;
            }
        }



        return lowHigh;
    }
}
