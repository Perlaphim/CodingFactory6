package gr.aueb.cf.ch6.prct6A;

import java.util.Arrays;

public class ArrayCopyWithMethodsApp {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arrCopy = new int[5];


        System.arraycopy(arr,0,arrCopy,0,arr.length);
        printArray(arrCopy);

        arrCopy = Arrays.copyOf(arr,arr.length);
        printArray(arrCopy);

        arrCopy = Arrays.copyOfRange(arr,0,arr.length);
        printArray(arrCopy);
    }


    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }

        System.out.println();
    }
}
