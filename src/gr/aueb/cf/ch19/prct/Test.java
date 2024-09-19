package gr.aueb.cf.ch19.prct;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        var list = List.of(1,2,3,4,5);
        var strList = Arrays.asList("Car", "Cat", "Camel");
        Integer[] intArr = {1,2,3};

        print(list);
        System.out.println();
        print(strList);
        System.out.println();
        print(intArr);
    }

    private static void print(List<?> list) {
        list.forEach(System.out::println);
    }

    private static <T> void print(T[] arr) {
        for (T arrayItem : arr) {
            System.out.println(arrayItem);
        }
    }
}
