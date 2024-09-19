package gr.aueb.cf.ch19.prct.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(new Product("Eggs",3.5,3),
                new Product("Oranges",7.1,7),
                new Product("Milk",8.5,4),
                new Product("Apples",4.5,9)
        ));

        Collections.sort(products);
        products.forEach(System.out::println);

        System.out.println();

        Collections.reverse(products);
        products.forEach(System.out::println);
    }
}
