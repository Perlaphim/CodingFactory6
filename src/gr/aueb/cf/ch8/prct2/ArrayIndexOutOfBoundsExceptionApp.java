package gr.aueb.cf.ch8.prct2;

public class ArrayIndexOutOfBoundsExceptionApp {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i <= a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
