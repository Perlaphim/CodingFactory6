package gr.aueb.cf.ch16.marker;

public class Main {

    public static void main(String[] args) {
        Book book = new Book();
        CompactDisk cd = new CompactDisk();

        deliver(book);
        deliver(cd);
    }

    public static void deliver(Item item) {
        if (item instanceof Book) {
            System.out.println("Book delivered");
        } else if (item instanceof CompactDisk) {
            System.out.println("CD delivered");
        } else {
            throw new RuntimeException("Can not be delivered");
        }
    }
}
