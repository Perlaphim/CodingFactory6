package gr.aueb.cf.ch6.prct6C;

public class CircularRotationApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println("Initial Array");
        print(arr);
        System.out.println();

        int[] right = doCircularRightShiftBy(arr,2);
        print(right);
        System.out.println();

        int[] left = doCircularLeftShiftBy(arr, 3);
        print(left);
        System.out.println();
    }


    /**
     * Rotates the elements of an array clockwise by an offset
     *
     * @param arr       the given array of integers
     * @param offset    the distance to rotate
     * @return          the rotated array, or null if
     *                  the given array is null
     */

    public static int[] doCircularRightShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length]= arr[i];
        }

        return rotated;
    }


    public static int[] doCircularLeftShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }

        return rotated;
    }

    public static void print(int[] arr) {
        if (arr == null) return;
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}