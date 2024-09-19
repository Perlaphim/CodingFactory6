package gr.aueb.cf.ch19.prct.generics;

public class NodeGenerics<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "NodeGenerics{" +
                "item=" + item +
                '}';
    }
}
