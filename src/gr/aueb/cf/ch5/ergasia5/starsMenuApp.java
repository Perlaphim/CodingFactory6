package gr.aueb.cf.ch5.ergasia5;

import java.util.Arrays;
import java.util.Scanner;

public class starsMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int num = 0;
        int conum = 0;



//        System.out.println("Please choose your number");
        do {
            System.out.println("Παρακαλώ επιλέξτε ένα απο τα παρακάτω:");
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια:");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n:");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");

            choice = in.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Παρακαλώ εισάγετε των αριθμό των αστερίων που θέλετε να εκτυπώσει το πρόγραμμα");
                    num = in.nextInt();
                    horizontalApp(num);
                    System.out.println(" ");
                    break;
                case 2:
                    verticalApp(num);
                    break;
                case 3:
                    nxnApp(num);
                    break;
                case 4:
                    nAscApp(num, conum);
                    break;
                case 5:
                    nDescApp(num, conum);
                    break;
                case 6:
                    System.out.println("Έξοδος");
                    break;
                default:
                    System.out.println("Ο αριθμός που πληκτρολογήσατε δεν υπαρχεί ως επιλογή");
            }
        } while (choice != 6);

    }

    public static void horizontalApp(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        return;
    }

    public static void verticalApp(int num) {
        Scanner in = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε των αριθμό των αστερίων που θέλετε να εκτυπώσει το πρόγραμμα");
        num = in.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("*");
        }
        return;
    }

    public static void nxnApp(int num) {
        Scanner in = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε των αριθμό των αστερίων που θέλετε να εκτυπώσει το πρόγραμμα");
        num = in.nextInt();
        for (int j = 1; j <= num; j++) {
            horizontalApp(num);
            System.out.println(" ");
        }
        return;
    }

    public static void nAscApp(int num, int conum) {
        Scanner in = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε των αριθμό των αστερίων που θέλετε να εκτυπώσει το πρόγραμμα");
        num = in.nextInt();
        conum = num;
        num = num - (num - 1);

        for (int j = 1; j <= conum; j++) {
            horizontalApp(num);
            System.out.println(" ");
            num++;
        }
        return;
    }


    public static void nDescApp(int num, int conum) {
        Scanner in = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε των αριθμό των αστερίων που θέλετε να εκτυπώσει το πρόγραμμα");
        num = in.nextInt();
        conum = num;

        for (int j = 1; j <= conum; j++) {
            horizontalApp(num);
            System.out.println(" ");
            num--;
        }
        return;
    }
}

