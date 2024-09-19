package gr.ergasies.erg14.ask1;

public class MathHelper {

    private MathHelper() {

    }

    public static void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }

    public static void findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println(min);
    }

    public static void findAvg(int[] arr) {
        int avg = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum/arr.length;
        System.out.println(avg);
    }
}
