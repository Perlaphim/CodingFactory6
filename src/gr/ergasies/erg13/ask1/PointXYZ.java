package gr.ergasies.erg13.ask1;

public class PointXYZ {
    private int x;
    private int y;
    private int z;

    public PointXYZ() {

    }

    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    public String ConvertToString() {
        return "Point (" + x + ", " + y + ", " + z + ")";
    }

    public String getXYDistance() {
        return "XY Distance: " + Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public String getYZDistance() {
        return "XY Distance: " + Math.sqrt(Math.pow(y, 2) + Math.pow(z, 2));
    }

    public String getXZDistance() {
        return "XY Distance: " + Math.sqrt(Math.pow(x, 2) + Math.pow(z, 2));
    }

    public String getXYZDistance() {
        return "XY Distance: " + Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }
}
