package gr.ergasies.erg14.ask3;

public class QueueManager {
    private int front = -1;
    private int rear = -1;
    private int capacity;
    private int[] arr;

    private static final QueueManager INSTANCE = new QueueManager();

    private QueueManager() {}

    public static QueueManager getInstance() {
        return INSTANCE;
    }

    public void peak(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        return;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.err.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        System.out.println("Enqueued: " + item);
        return;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.err.println("Queue is empty");
            return -1;
        }
        int item = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return item;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }
}
