package gr.aueb.cf.ch2.xmpls;

public class OverflowApp {
    public static void main(String[] args) {

        //δήλωση και αρχικοποιήση μεταβλητών
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        result = num1 +num2;
        System.out.println("το αποτέλεσμα είναι: " + result);


    }
}
