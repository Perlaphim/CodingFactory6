package gr.aueb.cf.ch19.prct.collections.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>(
                List.of(new Product("Eggs",10.5,10),
                        new Product("Oranges",20.5,20),
                        new Product("Honey",20,20))
        );

        List<Product> updatedProductList = productList.stream()
                .map(p -> new Product(p.getDescription(), p.getPrice() * 0.12, p.getQuantity()))
                .collect(Collectors.toList());

        updatedProductList.forEach(System.out::println);
    }
}
