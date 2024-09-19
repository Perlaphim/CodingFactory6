package gr.ergasies.erg6A;

import java.util.Scanner;

public class GeneralMethodApp {

    public static void main(String[] args) {
        int[] arr = {15, 116, 611, 1, 221, 432, 9, 65, 4, 2};
        int element = 0;
        int elementPosition;
        int choice = 0;

        choice = chooseMethodList(choice);

        if (choice == 1) {
            elementPosition = searchArray(arr, element);
            if (elementPosition != -1) {
                System.out.println(elementPosition + 1);
            } else {
                System.out.println("Δεν βρέθηκε το στοιχείο");
            }
        } else if (choice == 2) {
            printEvenNum(arr);
        } else if (choice == 3) {
            getDoubleNum(arr);
        } else if (choice == 4) {
            checkArrPositiveNum(arr);
            if (checkArrPositiveNum(arr) == false) {
                System.out.println("Δεν υπάρχει θετικός αριθμός στο πίνακα");
            } else {
                System.out.println("Υπάρχει θετικός αριθμός στο πίνακα");
            }
        } else if (choice == 5) {
            checkIfAllPosArray(arr);
            System.out.println("Όλα τα στοιχεία του πίνακα είναι θετικοί αριθμοί");
        }
    }


    public static int chooseMethodList(int choice) {
        Scanner in = new Scanner(System.in);


        System.out.println("1. Αναζήτηση στοιχείου");
        System.out.println("2. Εμφάνιση ζύγων αριθμών");
        System.out.println("3. Mapping στοιχείων πίνακα με τα διπλάσιο");
        System.out.println("4. Έλεγχος παρουσίας θετικού αριθμού");
        System.out.println("5. Έλεγχος παρουσίας μόνο θετικών αριθμών");
        System.out.println();
        System.out.print("Παρακαλώ επιλέξτε μία από τις παραπάνω ενέργειες: ");
        choice = in.nextInt();

        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Σφάλμα. Δεν βρέθηκε τέτοια επιλογή");
        }
        return choice;
    }


    public static int searchArray(int[] arr, int element) {
        Scanner in = new Scanner(System.in);
        int elPosition = 0;

        System.out.print("Παρακαλώ εισάγετε ένα στοιχείο: ");
        element = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                elPosition = i;
                return elPosition;
            }
        }
        return elPosition = -1;
    }


    public static void printEvenNum(int[] arr) {
        int[] evensArr = new int[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }


    public static int[] getDoubleNum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }

        for (int item : arr) {
            System.out.print(item + " ");
        }
        return arr;
    }


    public static  boolean checkArrPositiveNum(int[] arr) {
        boolean positiveNum = false;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveNum = true;
                return positiveNum;
            }
        }
        return positiveNum;
    }


    public static boolean checkIfAllPosArray(int[] arr) {
        boolean allPositives = false;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] < 0) {
                allPositives = false;
                return allPositives;
            }
        }
        return allPositives = true;
    }
}
