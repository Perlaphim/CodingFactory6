package gr.aueb.cf.ch19.prct.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;

public class MyStack<T> {
    private final Deque<T> myStack = new ArrayDeque<>();

    public MyStack() {}

    public Deque<T> getMyStack() {
        return new ArrayDeque<>(myStack);
    }

    public void push(T t) {
        myStack.push(t);
    }

    public T pop() {
        return myStack.pop();
    }

    public void forEach(Consumer<T> action) {
        myStack.forEach(action);
    }
}
