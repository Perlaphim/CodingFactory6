package gr.aueb.cf.ch15.prct.point;

public class Point {
    private double x;

    public Point() {}

    public Point(int x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "(" + x + ")";
    }


    public void movePlus10() {

        for (int i = 0; i < 10; i++) {
            movePlusOne();
        }
    }

    protected void movePlusOne() {
        x++;
    }

    private void reset() {
        x = 0;
    }

    protected void printTypeOf() {
        System.out.println(this.getClass().getSimpleName());
    }
}
