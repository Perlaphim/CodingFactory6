package gr.aueb.cf.ch6.prct6C;

public class AddTwoBigIntsApp {


    public static void main(String[] args) {
            int[] arr1 = {8,9,9};
            int[] arr2 = {5,2,1};
            int[] arrOut;
            arrOut = addTwoInts(arr1,arr2);

            for (int item : arrOut) {
                System.out.print(item + " ");
            }
    }

    public static int[] addTwoInts(int[] arr1, int[] arr2) {
        int[] arrOut;
        int currentSum;
        int carry = 0;

        if ((arr1 == null) || (arr2 == null) || (arr1.length != arr2.length)){
           return null;
        }

        arrOut = new int[arr1.length + 1];
        for (int i = arr1.length - 1; i >= 0; i--) {
            currentSum = arr1[i] + arr2[i] + carry;

            arrOut[i+1] = currentSum % 10;
            carry = currentSum / 10;
        }

        arrOut[0] = carry;
        return arrOut;
    }
}
