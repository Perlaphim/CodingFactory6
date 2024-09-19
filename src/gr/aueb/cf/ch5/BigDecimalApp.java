package gr.aueb.cf.ch5;

import java.math.BigDecimal;

public class BigDecimalApp {

    public static void main(String[] args) {
        BigDecimal actual = new BigDecimal("0.0");
        BigDecimal expected = new BigDecimal("1.0");

        for (int i = 1; i <= 10; i++) {
            actual = actual.add(BigDecimal.valueOf(0.1));
        }

        System.out.printf("actual: ", actual);
        System.out.printf("expected: ", expected);

        if (actual.equals(expected)) {
            System.out.println("EQUALS");

        }else
            System.out.println("NOT EQUALS");
    }
}
