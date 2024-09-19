package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("US", "United States");
        countries.put("UK", "United Kingdom");
        countries.put("RU", "Russia");
        countries.put("CH", "China");
        countries.put("SA", "Saudi Arabia");
        countries.put("SP", "Spain");
        countries.put("AU", "Australia");
        countries.put("IN", "India");
        countries.put("JP", "Japan");
        countries.put("KR", "Korea");
        countries.put("Id", "Indonesia");
        countries.put("BR", "Brazil");
        countries.put("TR", "Turkey");
        countries.put("MX", "Mexico");
        countries.put("FR", "France");
        countries.put("GB", "Germany");
        countries.put("IT", "Italy");
        countries.put("ZA", "South Africa");
        countries.put("CA", "Canada");
        countries.put("AR", "Argentina");

        Iterator<Map.Entry<String, String>> itr = countries.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
            if (entry.getValue().equals("US")) {
                System.out.println(entry.getKey() + ": United States");
                itr.remove();
            }
        }

        countries.remove("US");
    }
}
