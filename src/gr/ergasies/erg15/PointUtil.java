package gr.ergasies.erg15;

public class PointUtil {


    public static double distanceFromOrigin(Point point) {
        return point.getDistanceFromOrigin();
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point2D();
        Point p3 = new Point3D();

        ((Point) p1).setX(12);
        ((Point2D) p2).setX(12);
        ((Point3D) p3).setX(12);
        ((Point2D) p2).setY(31);
        ((Point3D) p3).setY(31);
        ((Point3D) p3).setZ(23);


        distanceFromOrigin(p1);
        distanceFromOrigin(p2);
        distanceFromOrigin(p3);

       doPrint(p1);
       doPrint(p2);
       doPrint(p3);
    }

    public static void doPrint(Point point) {
        System.out.println(distanceFromOrigin(point));
    }
}
