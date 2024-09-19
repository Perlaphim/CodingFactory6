package gr.aueb.cf.ch6.prct6B;

/**
 * Demonstrates filtering with arrays
 */

public class FilteringApp {

    public static void main(String[] args) {
        int[] grades = new int[] {4,9,8,8,7,2,1,4,10};
        final int PASS = 5;

        int[] passes = getPassGrade(grades,PASS);
        for (int item : passes) {
            System.out.print(item + " ");
        }
    }


    public static int[] getPassGrade(int[] arr,int limit) {
        int count  = 0;
        if (arr == null) return null;
        for (int item : arr) {
            if (item >= limit) {
                count++;
            }
        }

        int[] passOver = new int[count];
        int pivot = -1;
        for (int item : arr) {
            if (item >= limit) {
                passOver[++pivot] = item;
            }
        }
        return passOver;
    }
}
