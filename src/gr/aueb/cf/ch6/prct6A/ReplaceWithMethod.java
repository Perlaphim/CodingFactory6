package gr.aueb.cf.ch6.prct6A;


public class ReplaceWithMethod {

    public static void main(String[] args) {
        int[] grades = {4,6,7,11,20};

        upscaleByOne(grades);
        printArray(grades);
    }

    public static void upscaleByOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
