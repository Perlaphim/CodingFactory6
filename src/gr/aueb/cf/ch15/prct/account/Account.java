package gr.aueb.cf.ch15.prct.account;

import gr.aueb.cf.ch15.prct.account.exceptions.*;

import java.time.LocalDateTime;

public class Account extends IdentifiableEntity {
    private String iban;
    private User holder;
    private double balance;

    public Account() {}

    public Account(String iban, User holder, double balance) {
        this.iban = iban;
        this.holder = holder;
        this.balance = balance;
    }

    public String getIban() { return iban; }

    public void setIban(String iban) { this.iban = iban; }

    public User getHolder() { return new User(holder); }

    public void setHolder(User holder) { this.holder = new User(holder); }

    public double getBalance() { return balance; }

    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) throws NegativeAmountException{
        try {
            if (amount < 0) {
                throw new NegativeAmountException(amount);
            }
            balance += amount;
            System.out.println("Balance deposit: " + holder + ", amount: " + amount + ", " + LocalDateTime.now());
        } catch (NegativeAmountException e) {
            System.err.println("Service Error: Negative amount Exception!");
            throw e;
        }
    }

    public void withdraw(double amount, String ssn) throws InsufficientBalanceException, SsnNotValidException{
        try {
            if (amount < balance) {
                throw new InsufficientBalanceException(balance,amount);
            }
            if (!(isSsnNotValid(ssn))) {
                throw new SsnNotValidException(ssn);
            }
            balance -= amount;
            System.out.println("Balance withdraw: " + holder + ", amount: " + amount + ", " + LocalDateTime.now());
        } catch (InsufficientBalanceException | SsnNotValidException e) {
            System.err.println("Service Error: " + e.getMessage());
            throw e;
        }
    }

    public boolean isSsnNotValid(String ssn) {
        if  ((ssn == null) | (getHolder().getSsn() == null)) {
            return false;
        }
        return this.holder.getSsn().equals(ssn);
    }

    @Override
    public String toString() {
        return "(iban = " + iban + ", holder = " + holder + ", balance = " + balance + ")";
    }


}
