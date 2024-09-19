package gr.aueb.cf.ch15.bankApp;

import gr.aueb.cf.ch15.bankApp.exceptions.*;

import java.time.LocalDateTime;

public class OverdraftAccount extends Account{

    public OverdraftAccount() {}

    public OverdraftAccount(double balance, User holder, String iban) {
        super(balance, holder, iban);
    }

    @Override
    public void withdraw(double amount, String ssn) throws InsufficientBalanceException, SsnNotValidException, NegativeAmountException {

        try {
            if (amount < 0) {
                throw new NegativeAmountException(amount);
            }
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }
            setBalance(getBalance() - amount);

            //logging
            System.out.println("Success in withdraw. Amount: " + amount + " Ssn: " + ssn);
        } catch (SsnNotValidException|NegativeAmountException e) {
            System.err.println("Error: " + e.getMessage() + ", " + LocalDateTime.now());
            throw e;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
