package gr.aueb.cf.ch6;

/*
 * Impliments a
 */

public class StackApp {
    static int[] stack = new int[100];
    static int top = -1;

    public static void main(String[] args) {

        push(1);
        push(2);
        push(3);
        push(4);
        int popped = pop();
        System.out.println("Popped: " + popped);
        System.out.println("Traverse: ");
        traverseStack();
    }


    public static void push(int num) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }

        stack[++top] = num;
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;     //Will be solved with exceptions
        }
        return stack[top--];
    }

    public static boolean isFull() {
        return top == stack.length - 1;
    }

    public static boolean isEmpty() {
        return top == - 1;
    }

    public static void traverseStack() {

        for (int i = top; i <= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
