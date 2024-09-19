package gr.aueb.cf.ch19.prct.generics;

public class GenericNodeApp2 {

    public static void main(String[] args) {
        GenericNode2<Integer, String> node = new GenericNode2<>();
        node.setItem1(1);
        node.setItem2("CF");

        System.out.println(node.getItem1());
        System.out.println(node.getItem2());
    }
}
