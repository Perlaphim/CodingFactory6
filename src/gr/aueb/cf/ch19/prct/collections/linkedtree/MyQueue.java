package gr.aueb.cf.ch19.prct.collections.linkedtree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

public class MyQueue<T> {
    private final Deque<T> myQueue = new LinkedList<>();

    public MyQueue() {}

    public Deque<T> getMyQueue() {
        return new LinkedList<>(myQueue);
    }

    public void enqueue(T t) {
        myQueue.addLast(t);
    }

    public T dequeue() {
        return myQueue.poll();
    }

    public void forEach(Consumer<T> action) {
        myQueue.forEach(action);
    }
}
