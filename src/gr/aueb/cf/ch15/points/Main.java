package gr.aueb.cf.ch15.points;

public class Main {

    public static void main(String[] args) {
        Point p = new Point(5);
        Point2D p2 = new Point2D(9, 4);

        doPrint(p);
        doPrint(p2);
    }

    public static void doPrint(Point p) {
        System.out.println(p);
    }
}
