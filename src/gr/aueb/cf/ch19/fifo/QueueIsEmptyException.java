package gr.aueb.cf.ch19.fifo;

public class QueueIsEmptyException extends Exception {
    private static final long serialVersionUID = 1233L;

    public QueueIsEmptyException(String s) {
        super(s);
    }
}
