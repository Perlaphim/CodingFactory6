package gr.aueb.cf.ch14.prct;

public class PointMain {

    public static void main(String[] args) {

        Point p1 = Point.getZeroPoint();
        Point p2 = Point.getRandomPoint();
        Point p3 = Point.getRandomPoint();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
