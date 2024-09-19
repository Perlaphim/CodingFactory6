package gr.ergasies.erg6B;

import java.util.Scanner;

public class Ergasia6B {

    public static void main(String[] args) {
        int[] arr = new int[6];

        arr = typeNumber(arr);

        System.out.println("Ο πίνακας έχει πάνω από τρεις άρτιους; " + checkEvenNum(arr));
        System.out.println("Ο πίνακας έχει πάνω από τρείς περιττούς; " + checkOddNum(arr));
        System.out.println("Ο πίνακας έχει πάνω από τρείς συνεχόμενους; " + checkConsecNum(arr));
        System.out.println("Ο πίνακας έχει πάνω από τρείς αριθμούς με τον ίδιο λήγοντα; " + checkEndings(arr));
        System.out.println("Ο πίνακας έχει πάνω από τρείς αριθμούς στην ίδια δεκάδα; " + checkDecNum(arr));

    }


    public static int[] typeNumber(int[] arr) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert six numbers between 1 and 49");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if ((arr[i] > 49) || (arr[i] < 0)) {
                System.out.println("You cannot type that");
                return null;
            }
        }
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
        return arr;
    }


    public static boolean checkEvenNum(int[] arr) {
        int countEven = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                countEven ++;
            }
        }
        return countEven >= 3;
    }


    public static boolean checkOddNum(int[] arr) {
        int countOdd = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                countOdd ++;
            }
        }
        return countOdd >= 3;
    }


    public static boolean checkConsecNum(int[] arr) {
        int countCons = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == arr[i+1] - 1) && (arr[i] == arr[i+2] - 2)) {
                countCons++;
            }
        }
        return countCons >= 3;
    }


    public static boolean checkEndings(int[] arr) {
        int[] endings = new int[10];
        boolean hasSameEnding = false;

        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int item : arr) {
            if (item >= 3) {
                hasSameEnding = true;
                break;
            }
        }
        return hasSameEnding;
    }

    public static boolean checkDecNum(int[] arr) {
        int[] decades = new int[10];
        boolean BelongsToSameDec = false;

        for (int item : arr) {
            decades[item / 10]++;
        }

        for (int item : arr) {
            if (item >= 3) {
                BelongsToSameDec = true;
                break;
            }
        }
        return BelongsToSameDec;
    }
}
