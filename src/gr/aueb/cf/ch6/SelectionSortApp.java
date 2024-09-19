package gr.aueb.cf.ch6;

public class SelectionSortApp {

    public static void main(String[] args) {
        int[] arr = {9, 13, 71, 12, 54, 31, 11, 53, 123};

    }

    /**
     * Sorting base on Selection Sort.
     * Time complexity 0(n^2)
     * @param arr
     */

    public static void selectionSort(int[] arr){
        if (arr == null) return;
        int min;
        int minPosition;

        for (int i = 0; i < arr.length - 1; i++) {
            minPosition = 1;
            min = arr[i];


            for (int j = i; j < arr.length; j++){
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }

                swap(arr, i, minPosition);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    public static void traverseArray(int[] arr) {
        for (int element: arr) {
            System.out.println(element + " ");
        }
    }
}
