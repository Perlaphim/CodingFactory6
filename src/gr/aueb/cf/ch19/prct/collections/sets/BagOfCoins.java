package gr.aueb.cf.ch19.prct.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class BagOfCoins {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        bag.add("1E");
        bag.add("2E");
        bag.add("50cents");
        bag.add("10cents");

        bag.remove("10cents");

        bag.forEach(System.out::println);
    }
}
