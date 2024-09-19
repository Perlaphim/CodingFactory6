package gr.ergasies.erg6A;

public class SecondMinApp {

    public static void main(String[] args) {
        int[] arr = {15,116,611,1,221,432,9,65,4,2};
        int SecondMinPosition = 0;
        int tmp;

        SecondMinPosition = getMinPosition(arr,0,arr.length-1);

        System.out.printf("Second min value: %d, Second min position: %d", arr[SecondMinPosition], SecondMinPosition);
    }

    public static int getMinPosition(int[] arr, int low, int high) {
        int minPosition = low;
        int minValue;
        int secondMinValue;
        int secondMinPosition = 0;

        if ((low < 0) || (high > arr.length - 1)) {
            System.out.println("Error in array dimentions");
            return -1;
        }

        minValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }

        secondMinValue = arr[low];
        for (int j = low; j <= high; j++) {
            if (arr[j] > minValue && arr[j] < secondMinValue) {
                secondMinPosition = j;
            }
        }

        return secondMinPosition;
    }
}
