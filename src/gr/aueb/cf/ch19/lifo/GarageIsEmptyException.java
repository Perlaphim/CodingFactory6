package gr.aueb.cf.ch19.lifo;

public class GarageIsEmptyException extends Exception {
    private static final long serialVersionUID = 112354523L;

    public GarageIsEmptyException(String s) {
        super(s);
    }
}
