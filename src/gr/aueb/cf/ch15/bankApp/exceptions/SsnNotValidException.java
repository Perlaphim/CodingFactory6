package gr.aueb.cf.ch15.bankApp.exceptions;

public class SsnNotValidException extends Exception {
    private static final long serialVersionUID = 1234542L;

    public SsnNotValidException(String ssn) {
        super("SSN: " + ssn + " not valid");
    }
}
