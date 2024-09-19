package gr.aueb.cf.ch19.prct.collections.Iterator;

import java.util.Iterator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<String> cities = List.of("Athens", "Madrid", "Rome", "Lisbon", "Valletta") ;

        cities.forEach(System.out::println);
    }
}