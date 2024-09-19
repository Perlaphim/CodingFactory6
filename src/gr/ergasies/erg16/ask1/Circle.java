package gr.ergasies.erg16.ask1;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ITwoDimensional, Cloneable, Serializable {
    private static final long serialVersionUID = 14235L;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // copy Constructor
    public Circle(Circle circle) {
        this.radius = circle.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radius);
    }

    //clone

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
