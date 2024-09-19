package gr.aueb.cf.ch16.prct.marker;

import java.awt.print.Printable;

public class Main {

    public static void main(String[] args) {
        Item book = new Book("1", "123", "Th", "Java I");
        Item cd = new CompactDisk(1, "Prince");


        deliver(book);
        deliver(cd);
    }

    public static void deliver(Item item) {
        if (item instanceof Book) {
            System.out.println("Book delivered");
        } else if (item instanceof CompactDisk) {
            System.out.println("Cd delivered");
        } else {
            throw new AssertionError(item);
        }
    }
}
