package gr.aueb.cf.ch19.prct.generics;

public class NodeFlexibleApp {

    public static void main(String[] args) {
        NodeFlexible app = new NodeFlexible();

        app.setItem("data");
        int data = (int) app.getItem();

        System.out.println(data);
    }
}
