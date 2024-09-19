package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArraysUtilApp {

    public static void main(String[] args) {
        int[] arr = {1, 43, 12, 655, 33, 4};
        int[] arrCopy;
        int[] arrSecondCopy;


        Arrays.sort(arr);
        traverse(arr);
        System.out.println();

        arrCopy = Arrays.copyOf(arr, arr.length);
        traverse(arrCopy);

        arrSecondCopy = Arrays.copyOfRange(arr, 1, arr.length);
        traverse(arrSecondCopy);
        System.out.println();
    }


    public static void traverse(int[] arr) {
        for (int item : arr) {
            System.out.println(item + " ");
        }
    }
}
