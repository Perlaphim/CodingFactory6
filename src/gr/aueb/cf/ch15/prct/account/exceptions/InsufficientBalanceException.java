package gr.aueb.cf.ch15.prct.account.exceptions;

public class InsufficientBalanceException extends Exception{
    private static final long serialVersionUID = 1425777337267L;


    public InsufficientBalanceException(double balance, double amount){
        super("Insufficient balance for " + amount + " " + balance);
    }
}
