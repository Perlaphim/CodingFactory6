package gr.aueb.cf.ch19.dll.linear;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<String>();

        //Add
        cities.add("Athens");
        cities.add("Paris");
        cities.add("Kalavrita-city");

        //Get
        String mycity = cities.get(0);
        System.out.println(mycity);

        //update
        cities.set(0, "Αθήνα");

        //Remove
        cities.removeIf(c -> c.length() > 10);
        cities.removeIf(c -> c.equals("Paris"));


        //Traverse
        Iterator<String> itr = cities.iterator();
        while (itr.hasNext()) {
            String city = itr.next();
            System.out.println(city);
        }


        cities.forEach(System.out::println);

        //Safe for Remove with iterator.remove()
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String c = it.next();
            if (c.equals("Αθήνα")) {
                it.remove();
                // cities.remove(c); ConcurrentModificationException itr fails fast
            }
        }
    }
}
