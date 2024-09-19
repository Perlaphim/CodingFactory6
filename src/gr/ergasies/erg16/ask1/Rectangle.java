package gr.ergasies.erg16.ask1;

import java.io.Serializable;

public class Rectangle extends AbstractShape implements ITwoDimensional, Cloneable, Serializable {
    private static final long serialVersionUID = 434091L;
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {

        this.width = width;
        this.height = height;
    }

    // copy Constructor
    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0 && Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(width);
        result = 31 * result + Double.hashCode(height);
        return result;
    }

    //clone

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
