package gr.aueb.cf.ch14.prct;

import java.util.Random;

/**
 *  Initializes a newly created point,
 *  so that it represents a (0,0) point
 */

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    /**
     *  Constructs a new Point with specific (x,y) coordinates
     *
     * @param x
     * @param y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *          Static factory method
     * @return  a new point instance
     */

    public static Point getZeroPoint() {
        return new Point();
    }

    public static Point getRandomPoint() {
        Random rnd = new Random(System.currentTimeMillis());
        return new Point(rnd.nextInt(101), rnd.nextInt(101));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
