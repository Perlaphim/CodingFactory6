package gr.aueb.cf.ch19.prct.generics;

public class GenericMethodClass {

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4, 5};
        String[] strArr = {"one", "two", "three", "four", "five"};

        printArray(intArr);
        printArray(strArr);
    }

    private static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
