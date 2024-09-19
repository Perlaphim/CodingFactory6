package gr.aueb.cf.ch19.prct;

import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
        var intItem = new Node<Integer>();
        var stringItem = new Node<String>();

        intItem.setItem(1);
        stringItem.setItem("a");

        System.out.println(intItem.getItem());
        System.out.println(stringItem.getItem());
    }
}
