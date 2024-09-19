package gr.aueb.cf.ch5;

import java.util.Scanner;

public class FarenheitToCelciusMethodApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int celcius = 0;
        double farenheit = 0.0;

        System.out.println("Insert the degrees in farenheit");
        farenheit = in.nextDouble();

        celcius = (int) convertFarenheitIntoCelcius(farenheit);

        System.out.printf("%4.2f\u2109\t=\t%d\u2103",farenheit, celcius);
    }


    public static double convertFarenheitIntoCelcius(double farenheit) {
        return (farenheit - 32) * 5/9;
    }
}
