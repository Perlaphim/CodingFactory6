package gr.aueb.cf.ch6.prct6A;

public class ShallowCopyApp {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arrCopy = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }
        arrCopy[3] = 5;
        printArray(arrCopy);
        printArray(arr);
    }


    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }

        System.out.println();
    }
}
