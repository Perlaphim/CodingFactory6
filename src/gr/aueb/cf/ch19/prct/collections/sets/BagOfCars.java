package gr.aueb.cf.ch19.prct.collections.sets;

import java.util.*;

public class BagOfCars {

    public static void main(String[] args) {
        TreeSet<String> bag = new TreeSet<>();

        bag.add("Toyota");
        bag.add("Sudan");
        bag.add("Benz");

        bag.remove("Benz");

        bag.forEach(System.out::println);
    }
}
