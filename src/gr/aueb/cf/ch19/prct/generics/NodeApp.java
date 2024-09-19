package gr.aueb.cf.ch19.prct.generics;

public class NodeApp {

    public static void main(String[] args) {
        Node node = new Node();

        node.setItem(7);
        int data = node.getItem();

        System.out.println(data);
    }
}
