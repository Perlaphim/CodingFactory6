package gr.aueb.cf.ch19.prct.collections.Iterator;

import java.util.Iterator;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        List<String> cities = List.of("Athens", "Madrid", "Rome", "Lisbon", "Valletta") ;

        for (String c : cities) {
            System.out.println(c);
        }
    }
}