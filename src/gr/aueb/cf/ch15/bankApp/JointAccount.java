package gr.aueb.cf.ch15.bankApp;

import java.util.Arrays;

public class JointAccount extends Account{
    private User[] otherHolders;

    public JointAccount(User[] otherHolders) {
        this.otherHolders = otherHolders;
    }

    public JointAccount(double balance, User holder, String iban, User[] otherHolders) {
        super(balance, holder, iban);
//      this.otherHolders = otherHolders;
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
    public String toString() {
        return "JointAccount(uuid = " + getUuid() + " otherHolders =" + Arrays.toString(otherHolders) + " balance = " + getBalance() + " iban = " + getIban() + ")";
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
}
