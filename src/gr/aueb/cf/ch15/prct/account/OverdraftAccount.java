package gr.aueb.cf.ch15.prct.account;

import gr.aueb.cf.ch15.prct.account.exceptions.*;

import java.time.LocalDateTime;

public class OverdraftAccount extends Account{

    public OverdraftAccount() {}

    public OverdraftAccount(String iban, User holder, double balance) {
        super(iban, holder, balance);
    }

    @Override
    public void withdraw(double amount, String ssn) throws SsnNotValidException {
        try {
            if (!(isSsnNotValid(ssn))) {
                throw new SsnNotValidException(ssn);
            }
            setBalance(getBalance() - amount);
        } catch (SsnNotValidException e) {
            System.err.println("Service Error: " + e.getMessage());
            throw e;
        }
    }
}
