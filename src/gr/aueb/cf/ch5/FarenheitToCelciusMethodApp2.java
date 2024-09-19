package gr.aueb.cf.ch5;

public class FarenheitToCelciusMethodApp2 {

    public static void main(String[] args) {

        for (int i=-100; i<=100; i+= 10) {
            System.out.printf("%4d\u2109\t=\t%4.2f\u2103\n", i, getCelciusFromFarenheit(i));
        }
    }


    public static double getCelciusFromFarenheit(int i) {
        return ( i - 32) * 5/9;
    }
}
