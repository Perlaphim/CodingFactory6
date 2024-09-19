package gr.aueb.cf.ch19.prct.collections.sorting;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(new Product("Eggs",3.5,3),
                new Product("Oranges",7.1,7),
                new Product("Milk",8.5,4),
                new Product("Apples",4.5,9)
        ));

        Collections.sort(products, Comparator.naturalOrder());
        products.forEach(System.out::println);

        Collections.sort(products, Comparator.reverseOrder());
        products.forEach(System.out::println);
    }
}
