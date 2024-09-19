package gr.aueb.cf.ch3.Erg3;

import java.util.Scanner;

public class RepeatMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        while (num != 5) {

            System.out.println("Παρακαλώ Εισάγετε έναν αριθμό από το 1 έως και το 5");
            num = in.nextInt();

            if (num == 1){
                System.out.println("Επιλέξατε Εισαγωγή");

            }else if (num ==2){
                System.out.println("Επιλέξατε Διαγραφή");

            }else if (num ==3){
                System.out.println("Επιλέξατε Ενημέρωση");

            }else if (num ==4){
                System.out.println("Επιλέξατε Αναζήτηση");

            }else if (num ==5){
                System.out.println("Επιλέξατε Έξοδος" +
                        "");
                break;

            }else{
                System.out.println("Ο αριθμός που εισάγατε δεν ανοίκει στο εύρος των επιλογών");

            }
        }
    }
}
