package gr.aueb.cf.ch2.xmpls;

public class OutputApp {
    public static void main(String[] args) {

        int num1 = 10;
        long num2 = 20L;

        System.out.println("Hello");
        System.out.print("Hello");
        System.out.println("");
        System.out.printf("Hello");

        System.out.println("Num1 is: " + num1);
        System.out.printf("Num1 is: %d", num1);
        System.out.printf("Num1 is: %d, Num2 is: %d", num1, num2);
    }
}
