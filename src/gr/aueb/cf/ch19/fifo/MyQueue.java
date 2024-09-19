package gr.aueb.cf.ch19.fifo;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue<T> {
    private final Deque<T> myQueue = new LinkedList<>();

    public MyQueue() {
    }

    public void enQueue(T t) {
        myQueue.addFirst(t);
    }

    public T deQueue() throws QueueIsEmptyException{
        return myQueue.poll();
    }

    public int getSize() {
        return myQueue.size();
    }

    public boolean isEmpty() {
        return myQueue.isEmpty();
    }
}
