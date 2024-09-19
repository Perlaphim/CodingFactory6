package gr.aueb.cf.ch19.prct.collections.countries;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("FR", "France");
        countries.put("DE", "Germany");
        countries.put("NT", "Netherlands");
        countries.put("BE", "Belgium");
        countries.put("LU", "Luxembourg");

        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        countries.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
