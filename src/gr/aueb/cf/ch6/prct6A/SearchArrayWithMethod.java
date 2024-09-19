package gr.aueb.cf.ch6.prct6A;

import java.util.Scanner;

public class SearchArrayWithMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {100,200,300};
        int position = 0;
        int value = in.nextInt();


        position = getElementPosition(array, value, position);

        if (getElementPosition(array, value, position) != -1) {
            System.out.printf("Value: %d, Position %d", position, array[position]);
        } else {
            System.out.println("Value was not found");
        }
    }

    public static int getElementPosition(int[] arr, int value, int position) {

        if (arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                position = i;

                return i;
            }
        }

        return -1;
    }
}
