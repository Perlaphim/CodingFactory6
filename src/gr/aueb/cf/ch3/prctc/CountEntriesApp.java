package gr.aueb.cf.ch3.prctc;

import java.util.Scanner;

public class CountEntriesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1;
        final int MAX_WORKERS = 10;
        boolean entry = false;

    while (count <= MAX_WORKERS){
            System.out.println("Έχουμε νέα Πρόσληψη; ");
            entry = in.nextBoolean();

            if (entry == true) {
                count++;
                System.out.println("Καλώς ήρθες στην ομάδα!!");
            }
        }

        System.out.println("Γεμίσαμε!!!!!");
    }
}
