package gr.aueb.cf.ch15;

public class Point3D extends Point {
    private double y;
    private double z;

    public Point3D() {
        // super();
        // y = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String convertToString() {
        return "(" + getX() + ", " + y + ", " + z + ")";
    }
}
