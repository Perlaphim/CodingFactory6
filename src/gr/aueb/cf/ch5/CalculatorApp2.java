package gr.aueb.cf.ch5;

import java.io.IOException;
import java.util.Scanner;

/**
 * Impliments of a calculator.
 */

public class CalculatorApp2 {

//    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        char choice = ' ';
//        int errorCode;
//        int num1 = 0;
//        int num2 = 0;
//        int result = 0;
//
//        while (true) {
//            printMenu();
//            choice = getChoice(choice);
//            errorCode = validate(choice);
//        }
//
//        if (errorCode == 1) {
//            System.out.println("Quiting ...");
//        }
//        if (errorCode == 2) {
//            System.out.println("Error in choice ...");
//        }
//        System.out.println("Insert two integers");
//        num1 = in.nextInt();
//        num2 = in.nextInt();
//
//        result = getResultFromChoice(choice, num1, num2);
//
//        if (result == Integer.MIN_VALUE) {
//            System.out.println("Divided by zero error ...");
//        }
//
//        if (result == Integer.MAX_VALUE) {
//            System.out.println("Invalid choice. Please try again.");
//        }
//
//        System.out.println("Result = " + result);
//    }
//

    /**
     *
     * @param choice    Choice should be 1.add 2.sub 3.mul
     *                  4.div 5.mod. Any other choice leads to an
     *                  error state and the method returns Integer.MAX_VALUE
     *
     * @param num1      The first input number
     *
     * @param num2      The second input number
     * @return
     */

    public static int getResultFromChoice(char choice, int num1, int num2){
        int result = 0;

        switch (choice){
            case 1:
                result = add(num1,num2);
            case 2:
                result = sub(num1,num2);
            case 3:
                result = mul(num1,num2);
            case 4:
                result = div(num1,num2);
            case 5:
                result = mod(num1,num2);
            default:
                result = Integer.MAX_VALUE;
                break;
        }
        return result;
    }


    public static int add(int num1, int num2) { return num1 + num2; }

    public static int sub(int num1, int num2) { return num1 - num2; }

    public static int mul(int num1, int num2) { return num1 * num2; }

    public static int div(int num1, int num2) {
       if (num2 == 0){
           return Integer.MIN_VALUE;    //error code
       }
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        if (num2 == 0){
            return Integer.MIN_VALUE;    //error code
        }
        return num1 % num2;
    }

    public static char getChoice(char choice) throws IOException {
        return (char) System.in.read();
    }


    public static void printMenu(){
        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Module");
        System.out.println("Q/q. Έξοδος");
    }

    public static int validate(char choice) {
        int errorCode = 0;

        switch (choice) {
            case 'q':
            case 'Q':
                errorCode = 1;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                errorCode = 0;
            case 6:
                errorCode = 1;
            default:
                errorCode = 2;
                break;
        }
        return errorCode;
    }

}
