package gr.aueb.cf.ch6;

public class MinArray2App {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int minposition = 0;

        minposition = getMinPosition(arr);
        if (minposition == -1){
            System.out.println("Error is searching... ");
        }

        System.out.printf("Min-value: %d, Min-Position: %d", arr[minposition], minposition + 1);
    }


    public static int getMinPosition(int[] arr){
        if (arr == null) return -1;
        int minPosition = -1;
        int min = arr[0];

        for(int i= 0; i<=arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                minPosition = i;
            }
        }

        return minPosition;
    }
}
