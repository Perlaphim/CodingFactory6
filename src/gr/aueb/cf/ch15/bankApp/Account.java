package gr.aueb.cf.ch15.bankApp;

import java.time.LocalDateTime;
import gr.aueb.cf.ch15.bankApp.exceptions.*;

public class Account extends IdentifiableEntity{
    private double balance;
    private User holder;
    private String iban;

    public Account() {
        //super();
    }

    public Account(double balance, User holder, String iban) {
        //super();
        this.balance = balance;
        this.holder = holder;
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getHolder() {
        return holder;
    }

    public void setHolder(User holder) {
        this.holder = new User(holder);
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "(" + "balance=" + balance + ", holder=" + holder + ", iban='" + iban + ")";
    }

    /**
     * Deposits a certain amount of money int user's {@link Account}, thus increasing the {@link Account#balance}
     * @param amount                        amount of money to be deposited
     * @throws NegativeAmountException     if the amount to be deposited is negative
     */

    public void deposit(double amount) throws NegativeAmountException {
        try {
            if (amount <= 0) {
                throw new NegativeAmountException(amount);
            }
            balance += amount;
            //Logging
            System.out.println("Balance deposit: " + holder + ", amount: " + amount + ", " + balance);
        } catch (NegativeAmountException e) {
            //Logging
            System.err.println("Error in deposit service: Negative amount exception" + LocalDateTime.now());
            throw e;
        }
    }

    /**
     * Withdraws an amount of money from an {@link Account}.
     * @param amount                            The amount of money to withdraw
     * @param ssn                               The ssn {@link Account#holder}.
     * @throws InsufficientBalanceException     If the amount withdrawn is greater than the balance.
     * @throws SsnNotValidException             If the given ssn is not valid.
     * @throws NegativeAmountException          If the amount to withdraw is negative.
     */

    public void withdraw(double amount, String ssn) throws InsufficientBalanceException, SsnNotValidException, NegativeAmountException {
        try {
            if (amount <= 0) {
                throw new NegativeAmountException(amount);
            }
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }
            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }

            //Loging
            System.out.println("Balance withdraw success. SSN: " + ssn + ", amount: " + amount + ", " + LocalDateTime.now());
        } catch (InsufficientBalanceException | SsnNotValidException | NegativeAmountException e ) {
            System.err.println("Service Error: " + e.getMessage() + ", " + LocalDateTime.now());
            throw e;
        }
    }

    protected boolean isSsnValid(String ssn) {
        if (ssn == null || this.getHolder().getSsn() == null) {
            return false;
        }
        return this.holder.getSsn().equals(ssn);
    }

    /**
     * Return the {@link Account#balance}.
     * @return
     */
    public double getAccountBalance() {
        return balance;
    }
}
