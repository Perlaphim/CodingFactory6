package gr.ergasies.erg15;

public class Point2D extends Point {
    private double y;
    private double distanceY;

    public Point2D() {
        super();
        y=0;
    }

    public Point2D(double x, double y, double distanceY, double distance) {
        super(x,distance);
        this.distanceY = distanceY;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDistanceY() {
        return distanceY;
    }

    public void setDistanceY(double distanceY) {
        this.distanceY = distanceY;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + y + ')';
    }

    // Public API
    @Override
    public void movePlus10() {
        super.movePlus10();
        y+=10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y+=1;
    }

    @Override
    protected void subtractDistanceFromOrigin() {
        super.subtractDistanceFromOrigin();
        distanceY = y - 0;
    }

    @Override
    public double getDistanceFromOrigin() {
      return Math.sqrt(Math.pow(super.getDistanceFromOrigin(),2.0) + Math.pow(distanceY,2.0));
    }
}
