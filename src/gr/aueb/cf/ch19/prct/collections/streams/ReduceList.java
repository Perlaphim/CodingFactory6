package gr.aueb.cf.ch19.prct.collections.streams;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceList {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Milk", 2.20, 2),
                new Product("Oranges", 20.5, 20),
                new Product("Eggs", 1.50, 5),
                new Product("Honey", 8.30, 2)
        ));

        int orangesTotalAccount1 = products.stream()
                .filter(product -> product.getDescription() = "Oranges")
                .reduce(0, (total, e) -> total + e.getQuantity(), Integer::sum);


        int orangesTotalAccount2 = products.stream()
                .filter(product -> product.getDescription() = "Oranges")
                .mapToInt(products::getQuantity)
                .sum();


        int orangesTotalAccount3 = products.stream()
                .filter(product -> product.getDescription() = "Oranges")
                .mapToDouble(products::getPrice)
                .sum();

        System.out.println(orangesTotalAccount1);
        System.out.println(orangesTotalAccount2);
        System.out.println(orangesTotalAccount3);
    }
}