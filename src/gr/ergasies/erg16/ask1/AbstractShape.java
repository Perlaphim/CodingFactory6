package gr.ergasies.erg16.ask1;

import java.awt.*;

public abstract class AbstractShape implements IShape {
    public long id;

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }

    public void shapeType() {
        switch ((int) id) {
            case 1:
                System.out.println("Rectangle");
                break;
            case 2:
                System.out.println("Circle");
                break;
            case 3:
                System.out.println("Line");
                break;
            default:
                throw new AssertionError();
        }
    }
}
