package gr.aueb.cf.ch19.prct.collections.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PriceProducts {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Milk", 2.20, 2),
                new Product("Oranges", 20.5, 20),
                new Product("Eggs", 1.50, 5),
                new Product("Honey", 8.30, 2)
        );

        List<Product> sortedByPriceProducts = products.stream()
                .filter(product -> product.getQuantity() == 2)
                .sorted(Comparator.comparing(product -> product.getPrice()))
                .map(products.getDescription())
                .collect(Collectors.toList());
    }
}
