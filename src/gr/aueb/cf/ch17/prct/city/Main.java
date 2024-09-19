package gr.aueb.cf.ch17.prct.city;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        City athens = new City("Athens");

        City clonedAthens = athens.clone();

        clonedAthens.setDescription("Athens2");


        System.out.println(athens);
        System.out.println(clonedAthens);
    }
}
