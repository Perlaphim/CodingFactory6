package gr.aueb.cf.ch19.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(new Product("Milk",2.25, 100),
                new Product("Honey", 8.50, 50), new Product("Orange",3.15,200),
                new Product("App",5.90,20)));

        System.out.println("Ascending sorting");
        Collections.sort(products);
        products.forEach(System.out::println);

        System.out.println("Descending sorting");
        Collections.reverse(products);
        products.forEach(System.out::println);

        System.out.println("Natural Order");
        products.sort(Comparator.naturalOrder());
        products.forEach(System.out::println);

//        System.out.println("Reverse Order");
//        products.sort(Comparator.reverseOrder());
//        products.forEach(System.out::println);
//
//        products.sort(Comparator.comparing(Product::getDescription));
//        products.forEach(System.out::println);
//
//        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getQuantity));
//        products.forEach(System.out::println);
//
//        products.sort(Comparator.comparing(Product::getDescription).thenComparing(Product::getPrice).thenComparing(Product::getQuantity));
//        products.forEach(System.out::println);

//        products.sort(Comparator.comparing(Product::getDescription).thenComparing(Product::getPrice, (a1,a2) -> Double.compare(a2,a1)).thenComparing(Product::getQuantity));
//        products.forEach(System.out::println);

//        products.sort(Comparator.comparing(Product::getDescription).thenComparing(Product::getPrice).thenComparing(Product::getQuantity, Comparator.reverseOrder().reversed()));
//        products.forEach(System.out::println);
    }
}
