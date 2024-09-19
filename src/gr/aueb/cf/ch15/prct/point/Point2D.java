package gr.aueb.cf.ch15.prct.point;

public class Point2D extends Point {
    public double y;

    public Point2D() {
        super();
        y=0;
    }

    public Point2D(int x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + y + ')';
    }

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
}
