package gr.aueb.cf.ch6.prct6A;

import java.util.Scanner;


public class SearchArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = in.nextInt();
        int num;
        boolean keyFound = false;

        int[] arr = {1,5,9,11,16,19};

        for (int item : arr) {
            if (key == item) {
                keyFound = true;
                break;
            }
        }


        if (keyFound == false) {
            System.out.println("Key was not found");
        } else {
            System.out.println("Key is found");
        }
    }
}
