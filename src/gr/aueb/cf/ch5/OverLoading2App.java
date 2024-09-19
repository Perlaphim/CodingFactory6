package gr.aueb.cf.ch5;

public class OverLoading2App {

    public static void main(String[] args) {
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        sum2 = add(1,2);
        System.out.println(sum2);
        sum3 = add(1,2,3);
        System.out.println(sum3);
        sum4 = add(1,2,3,4);
        System.out.println(sum4);
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int add(int a, int b, int c) {
        return a+b+c;
    }

    public static int add(int a, int b, int c, int d) {
        return a+b+c+d;
    }
}
