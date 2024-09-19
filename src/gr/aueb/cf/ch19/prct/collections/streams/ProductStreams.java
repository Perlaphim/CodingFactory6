package gr.aueb.cf.ch19.prct.collections.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductStreams {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Milk",2.20,2),
                new Product("Eggs",1.50,5),
                new Product("Honey",8.30,2)
        ));

        List<Product> updatedProductList = products.stream()
                .filter(p -> p.getQuantity()==2)
                .sorted(Comparator.comparing(Product::getDescription)
                .map(Product::getDescription)
                .collect(Collectors.toList())
        );

        updatedProductList.forEach(System.out::println);
    }
}
