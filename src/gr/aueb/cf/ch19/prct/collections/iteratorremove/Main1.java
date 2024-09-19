package gr.aueb.cf.ch19.prct.collections.iteratorremove;

import java.util.Iterator;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        List<String> cities = List.of("Athens", "Madrid", "Rome", "Lisbon", "Valletta") ;

        cities.removeIf(s -> s.equals("Athens"));

        cities.forEach(System.out::println);
    }
}