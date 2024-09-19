package gr.aueb.cf.ch16.prct.tagFieldShape;

public class Shape {
    private enum TYPE {RECTANGLE, CIRCLE}


    //Tag Field
    private final TYPE type;

    //Fields for Rectangle
    private double width;
    private double height;


    //Field for Circle
    private double radius;

    //Constructor for Rectangle
    public Shape(double width, double height) {
        type = TYPE.RECTANGLE;
        this.width = width;
        this.height = height;
    }

    //Constructor for Circle
    public Shape(double radius) {
        type = TYPE.CIRCLE;
        this.radius = radius;
    }

    public double area() {
        switch (type) {
            case RECTANGLE:
                return width * height;
            case CIRCLE:
                return Math.pow(radius,2) + Math.PI;
            default:
                throw new AssertionError();
        }
    }
}