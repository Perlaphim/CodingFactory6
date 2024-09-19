package gr.ergasies.erg13.ask1;

public class Main {

    public static void main(String[] args) {
        PointXYZ p = new PointXYZ(1,2,3);

        System.out.println("PointXYZ: " + p.ConvertToString());


        System.out.println("XYDistance: " + p.getXYDistance());
        System.out.println("YZDistance: " + p.getYZDistance());
        System.out.println("XZDistance: " + p.getXZDistance());
        System.out.println("XYZDistance: " + p.getXYZDistance());
    }
}
