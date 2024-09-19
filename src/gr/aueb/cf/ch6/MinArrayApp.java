package gr.aueb.cf.ch6;

public class MinArrayApp {

    public static void main(String[] args) {
        int[] arr = {7,3,9,6,2,12};
        int minPosition;
        int maxPosition;


        minPosition = findmin(arr);
        System.out.printf("Min value: %d. Min position: %d\n",arr[minPosition], minPosition + 1);

        maxPosition = findmax(arr);
        System.out.printf("Max value: %d. Max position: %d",arr[maxPosition], maxPosition + 1);
    }



    /**
     * Returns the position of the min element
     * @param arr
     * @return
     */

    public static int findmin(int[] arr){
        int min = Integer.MAX_VALUE;
        int minPosition = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }

    public static int findmax(int[] arr){
        int max = Integer.MIN_VALUE;
        int maxPosition = 0;

        for(int j = 0; j < arr.length; j++){
            if(arr[j]>max){
                max = arr[j];
                maxPosition = j;
            }
        }
        return maxPosition;
    }
}
