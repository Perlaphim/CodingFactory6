package gr.aueb.cf.ch6.prct6A;

/**
 * Replaces all the instances of KEY in an array of ints
 */

public class ArrayUpdateApp {

static final int KEY = 10;

    public static void main(String[] args) {
        int[] arr = {1,5,8,9,10,15};

        updateArray(arr);

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static int updateArray(int[] arr) {
        for(int i=0; i < arr.length; i++) {
            if ( arr[i] == KEY) {
                arr[i] = (KEY - 2) * 3;
                return i;
            }
        }
        return -1;
    }
}
