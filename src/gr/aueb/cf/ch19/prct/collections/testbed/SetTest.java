package gr.aueb.cf.ch19.prct.collections.testbed;

import java.util.*;
import java.util.stream.Collectors;

public class SetTest {

    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Dubai");
        cities.add("Nairobi");
        cities.add("Bogota");


        Set<String> nonArabCities = cities.stream()
                .filter((c) -> !c.equals("Dubai"))
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));

        nonArabCities.forEach(System.out::println);
    }
}
