package gr.ergasies.erg15;

public class Point3D extends Point2D{
    private double z;
    private double distanceZ;

    public Point3D() {
        super();
        z = 0;
    }

    public Point3D(int x, double y, double z, double distanceY, double distanceZ, double distance) {
        super(x, y, distanceY, distance);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getDistanceZ() {
        return distanceZ;
    }

    public void setDistanceZ(double distanceZ) {
        this.distanceZ = distanceZ;
    }


    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ", " + z + ')';
    }

    // Public API
    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }

    @Override
    protected void subtractDistanceFromOrigin() {
        super.subtractDistanceFromOrigin();
        distanceZ = z - 0;
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(super.getDistanceFromOrigin(),2.0) + Math.pow(distanceZ,2.0));
    }
}
