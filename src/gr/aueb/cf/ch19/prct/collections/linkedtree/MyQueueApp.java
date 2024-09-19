package gr.aueb.cf.ch19.prct.collections.linkedtree;

public class MyQueueApp {

    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();

        myQueue.enqueue("Red Car");
        myQueue.enqueue("Green Car");
        myQueue.enqueue("Blue Car");

        String firstCar = myQueue.dequeue();

        System.out.println(myQueue.dequeue());
        myQueue.forEach(System.out::println);
    }
}
