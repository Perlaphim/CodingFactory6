package gr.aueb.cf.ch19.prct.examples;

public class NodeGenericBounded<T extends Number> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
