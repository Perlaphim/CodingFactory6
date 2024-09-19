package gr.aueb.cf.ch15.prct.account;

import gr.aueb.cf.ch15.prct.account.exceptions.*;

import java.time.LocalDateTime;

public class JointAccount extends Account {
    private User[] otherHolders;

    public JointAccount() {
    }

    public JointAccount(String iban, User holder, double balance, User[] otherHolders) {
        super(iban, holder, balance);
        this.otherHolders = otherHolders;
    }

    public User[] getOtherHolders() {
        return otherHolders;
    }

    public void setOtherHolders(User[] otherHolders) {
        this.otherHolders = otherHolders;
    }

    @Override
    public boolean isSsnNotValid(String ssn) {
        super.isSsnNotValid(ssn);
        for (User user : otherHolders) {
            if (user.getSsn().equals(ssn)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "JointAccount{" +
                "otherHolders=" + otherHolders +
                '}';
    }
}
