package gr.ergasies.erg13.bankapp.model;

public class OverdraftAccount {
    private String accountID;
    private double balance;

    public OverdraftAccount() {}

    public OverdraftAccount(String accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Withdraws an amount from the account and checks if the amount has a positive value
     * @param amount
     *          The amount that is withdrawn from the account
     * @throws Exception
     *          Throws an exception message if the amount is zero or has a negative value
     */

    public void withdraw(double amount) throws Exception {
        try {
            if (amount > balance) {
                this.balance -= amount;
            } else {
                throw new Exception("Invalid amount");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Check if the account id of the holder matches the id of the desired account
     * @param accountID
     *              The ID of the holder's account
     * @return
     * @throws Exception
     *              Throws an exception if the accoundID doesn't match
     */
    public boolean checkID(String accountID) throws Exception {
        try {
            if (!this.accountID.equals(accountID)) {
                throw new Exception();
            }
        } catch (Exception e) {
            throw e;
        }
        return true;
    }

    /**
     * Checks the current amount of balance in the account
     *
     * @param amount
     *           The amount that was withdrawn from the account
     */
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
