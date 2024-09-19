package gr.aueb.cf.ch19.prct.collections.deque;

import java.util.Stack;

public class MyStackApp {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        int lastItem = stack.pop();

        System.out.println(lastItem);

        stack.forEach(System.out::println);
    }
}
