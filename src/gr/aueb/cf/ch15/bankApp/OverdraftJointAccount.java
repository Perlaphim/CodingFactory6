package gr.aueb.cf.ch15.bankApp;

import java.util.Arrays;

public class OverdraftJointAccount extends Account{
    private User[] otherHolders;

    public OverdraftJointAccount() {}

    public OverdraftJointAccount(double balance, User holder, String iban, User[] otherHolders) {
        super(balance, holder, iban);
        this.otherHolders = new User[otherHolders.length];
        for (int i = 0; i < otherHolders.length; i++) {
            this.otherHolders[i] = otherHolders[i];
        }
    }


    public User[] getOtherHolders() {
//          return otherHolders;
        User[] otherHolders = new User[this.otherHolders.length];
        for (int i = 0; i < otherHolders.length; i++) {
            otherHolders[i] = new User(this.otherHolders[i]);
        }
        return otherHolders;
    }

    public void setOtherHolders(User[] otherHolders) {
//          this.otherHolders = otherHolders;
        otherHolders = new User[this.otherHolders.length];
        for (int i = 0; i < otherHolders.length; i++) {
            this.otherHolders[i] = new User(this.otherHolders[i]);
        }
    }

    @Override
    protected boolean isSsnValid(String ssn) {
        boolean areOthersValid = false;

        for (User user : otherHolders) {
            if (user.getSsn().equals(ssn)) {
                areOthersValid = true;
                break;
            }
        }
        return super.isSsnValid(ssn) || areOthersValid;
    }

    @Override
    public String toString() {
        return "OverdraftJointAccount(uuid = " + getUuid() + " Holder =" + getHolder() + " balance = " + getBalance() + " iban = " + getIban() + ")";
    }
}
