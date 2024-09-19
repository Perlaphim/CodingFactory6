package gr.aueb.cf.ch6.prct6A;

public class ArrayMinMax {

    public static void main(String[] args) {
        int[] arr = {7,6,2,5,8,12,6,2};
        int minPosition = 0;
        int maxPosition = 0;
        int minValue = arr[minPosition];
        int maxValue = arr[maxPosition];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > maxValue) {
                maxPosition = j;
                maxValue = arr[maxPosition];
            }
        }

        System.out.printf("MinValue: %d, MinPosition: %d\n",minValue,minPosition + 1);
        System.out.printf("MaxValue: %d, MaxPosition: %d",maxValue,maxPosition + 1);
    }
}
