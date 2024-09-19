package gr.ergasies.erg14.ask3;

import java.util.Scanner;
import java.util.Stack;

public class StackManager {
    private int top = -1;
    private int capacity;
    private String[] str;

    private static final StackManager INSTANCE = new StackManager();

    private StackManager() {}

    public static StackManager getInstance() {
        return INSTANCE;
    }

    public void peak(int capacity) {
        this.capacity = capacity;
        this.str = new String[capacity];
        return;
    }

    public void push(String item) {
        if (isFull()) {
            System.err.println("Stack is full");
            return;
        }
        str[++top] = item;
        System.out.println("Pushed: " + item);
        return;
    }

    public String pop() {
        if (isEmpty()) {
            System.err.println("Stack is empty");
            return null;
        }
        return str[top--];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == - 1;
    }
}
