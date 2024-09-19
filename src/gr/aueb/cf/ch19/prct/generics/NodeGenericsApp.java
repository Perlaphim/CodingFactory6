package gr.aueb.cf.ch19.prct.generics;

public class NodeGenericsApp {

    public static void main(String[] args) {
        NodeGenerics<Integer> intItem = new NodeGenerics<>();
        NodeGenerics<String> strgItem = new NodeGenerics<>();

        strgItem.setItem("CF");
        intItem.setItem(7);

        System.out.println(strgItem);
        System.out.println(intItem);
    }
}
