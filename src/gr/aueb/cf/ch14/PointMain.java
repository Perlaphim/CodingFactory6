package gr.aueb.cf.ch14;

public class PointMain {

    public static void main(String[] args) {
        Point zeroPoint = Point.getZeroPoint();
        Point randomPoint = Point.getRandomPoint();

        System.out.println(zeroPoint.toString());
        System.out.println(randomPoint.toString());
    }
}