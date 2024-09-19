package gr.ergasies.erg15;

public class Point {
    private double x;
    private double distance;

    public Point() {}

    public Point(double x, double distance) {
        this.x = x;
        this.distance = distance;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "(" + x + ")";
    }

    // Public API
    public void movePlus10() {

        for (int i = 0; i < 10; i++) {
            movePlusOne();
        }
    }

    public double getDistanceFromOrigin() {
        subtractDistanceFromOrigin();
        return distance;
    }

    protected void movePlusOne() {
        x++;
    }

    protected void subtractDistanceFromOrigin() {
        distance = x - 0;
    }

    private void reset() {
        x = 0;
    }

    protected void printTypeOf() {
        System.out.println(this.getClass().getSimpleName());
    }
}
