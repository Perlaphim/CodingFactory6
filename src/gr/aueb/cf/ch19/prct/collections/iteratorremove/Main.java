package gr.aueb.cf.ch19.prct.collections.iteratorremove;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> cities = List.of("Athens", "Madrid", "Rome", "Lisbon", "Valletta") ;
        Iterator<String> iterator = cities.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals("Athens")) {
                iterator.remove();
            }
        }
    }
}
