package gr.aueb.cf.ch19.sets;

import java.util.HashSet;
import java.util.Set;

public class TreesetDemo {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        if  (bag.contains("Milk")) {
            System.out.println("");
        } else {
            bag.add("Milk");
        }

        bag.add("Honey");
        //bag.remove("Milk");

//        if (bag.remove("Honey")) {
//            System.out.println("Successfull removal");
//        } else {
//            System.out.println("Error");
//        }

        bag.forEach(System.out::println);
    }

}
