package gr.aueb.cf.ch16.prct.skeletal;

public class abstractRectangle implements IRectangle{
    private double width;
    private double height;

    @Override
    public double getarea() {
        return width * height;
    }

    @Override
    public double getperimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean isSquare() {
        return width == height;
    }
}
