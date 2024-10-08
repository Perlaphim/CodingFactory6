package gr.aueb.cf.ch5;


/*
 * ανταλλάζει τις τιμές δύο ακεραίων
 */

public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a: %d, b: %d\n", a,b);
        swap(a,b);
        System.out.printf("a: %d, b: %d", a,b);

    }


    /**
     * Mutually interchangeables
     * the values of two integers.
     *
     * @param a
     * @param b
     */

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
