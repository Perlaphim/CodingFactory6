package gr.aueb.cf.ch17.opt;

import java.util.*;

public class HelloOptional {

    public static void main(String[] args) {
        Optional <String> opStr = Optional.of("CodingFactory6");

        String str = "Hello!!!";
        Optional<String> opStr2 = Optional.ofNullable(str);
        Optional<String> opStr3 = Optional.empty();

        if(opStr2.isPresent()) {
            String myStr = opStr2.get();
            System.out.println(myStr);
        } else {
            System.out.println("Error, String is null");
        }

        String s = opStr2.get();
        String s2 = opStr2.orElseThrow(() -> new RuntimeException(""));


        int[] arr = {1,2,3,4,5};

        int even = Arrays
                .stream(arr)
                .filter((el) -> el % 2 == 0)
                .findFirst()
                .orElse(-1);


        List<String> list = new ArrayList<>(Arrays.asList("Hello","CF"));
        List<Integer> myInt = new LinkedList<>();
        myInt.add(0);

        String valList = list
                    .stream()
                    .filter((el) -> el.startsWith("H"))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Error; Nothing was found"));


        list.removeIf(el -> el.startsWith("H"));
    }
}
