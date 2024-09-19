package gr.aueb.cf.ch15.bankApp.exceptions;

public class NegativeAmountException extends Exception {
    private static final long serialVersionUID = 15623L;

    public NegativeAmountException() {
        super("Ammount negative");
    }

    public NegativeAmountException(double ammount) {
        super("Amount: " + ammount + " is negative");
    }
}
