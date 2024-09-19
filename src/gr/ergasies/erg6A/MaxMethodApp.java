package gr.ergasies.erg6A;

public class MaxMethodApp {

    public static void main(String[] args) {
        int[] arr = {15,116,611,1,221,432,9,65,4,2};
        int maxPosition = 0;

        maxPosition = getMaxPosition(arr,0,arr.length-1);

        System.out.printf("Max value: %d, Max position: %d", arr[maxPosition], maxPosition);
    }

    public static int  getMaxPosition (int[] arr, int low, int high) {
        int maxPosition = low;
        int maxValue;

        if ((low < 0) || (high > arr.length - 1)) {
            System.out.println("Error in array dimentions");
            return -1;
        }

        maxValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue){
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }
}
