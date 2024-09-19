package gr.aueb.cf.ch6.prct6A;

import java.util.Scanner;

public class FindAndReplaceWithMethod {

    public static void main(String[] args) {
        int[] arr;
        int a = 0;
        int b = 0;
        arr = new int[] {1,2,3,9,4,5,6,7,8,9};

        replace(arr,a,b);
        print(arr);
    }

    public static void replace(int[] arr, int a, int b) {
        int PositionOfReplace = -1;
        Scanner in = new Scanner(System.in);

        System.out.println("please select the value you wish to replace");
        a = in.nextInt();
        System.out.println("please set the new value:");
        b = in.nextInt();

        if (arr == null) return;
        PositionOfReplace = getThePosition(arr, a);
        if (PositionOfReplace != -1) {
            arr[PositionOfReplace] = b;
        }
    }

    public static int getThePosition(int[] arr, int a) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }
        }

        return -1;
    }
    public static void print(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
