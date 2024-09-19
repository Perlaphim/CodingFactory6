package gr.aueb.cf.ch15.prct.account.exceptions;

public class NegativeAmountException extends Exception {
    private static final long serialVersionUID = 111284989L;


    public NegativeAmountException(double amount) {
        super("Amount: " + amount + " is insufficient to perform operation");
    }
}
