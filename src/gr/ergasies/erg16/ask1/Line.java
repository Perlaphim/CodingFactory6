package gr.ergasies.erg16.ask1;

import java.io.Serializable;

public class Line extends AbstractShape implements Cloneable, Serializable {
    private static final long serialVersionUID = 567846L;
    private final double length;

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    // copy Constructor
    public Line(Line line) {
        this.length = line.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Double.compare(length, line.length) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(length);
    }

    //clone
    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }
}
