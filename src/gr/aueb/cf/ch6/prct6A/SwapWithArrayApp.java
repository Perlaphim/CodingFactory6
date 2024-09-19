package gr.aueb.cf.ch6.prct6A;

public class SwapWithArrayApp {

    public static void main(String[] args) {
        int[] arr = {5,12};

        printArray(arr);
        System.out.println();
        Swap(arr);
        printArray(arr);
    }

    public static void Swap(int[] arr) {
        if (arr.length != 2) return;

        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
