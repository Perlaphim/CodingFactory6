package gr.aueb.cf.ch15.prct.point;

public class Main {

    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }


    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        doMovePlus10(p1);
        doMovePlus10(p2);
        doMovePlus10(p3);

        ((Point2D) p2).setX(12);

        doPrint(p1);
        doPrint(p2);
        doPrint(p3);
    }

    public static void doPrint(Point point) {
        System.out.println(point);
    }
}
