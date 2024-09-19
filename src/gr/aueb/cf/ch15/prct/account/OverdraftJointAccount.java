package gr.aueb.cf.ch15.prct.account;

import java.util.Arrays;

public class OverdraftJointAccount extends OverdraftAccount{
    private User[] otherHolders;

    public OverdraftJointAccount() {}

    public OverdraftJointAccount(String iban, User holder, double balance, User[] otherHolders) {
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
        for (User user : otherHolders) {
            if (user.getSsn().equals(ssn)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "OverdraftJointAccount{" +
                "otherHolders=" + Arrays.toString(otherHolders) +
                '}';
    }
}
