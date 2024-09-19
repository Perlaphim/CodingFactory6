package gr.aueb.cf.ch15.prct.account.exceptions;

public class SsnNotValidException extends Exception{
    private static final long serialVersionUID = 1906475L;


    public SsnNotValidException(String ssn) {
        super("SSN: " + ssn + " is not valid");
    }
}
