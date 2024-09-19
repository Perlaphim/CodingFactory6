package gr.aueb.cf.ch13.prct;

public class Account {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;


    public Account() {

    }

    public Account(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getIban() {return iban;}

    public void setIban(String iban) {this.iban = iban;}

    public String getFirstname() {return firstname;}

    public void setFirstname(String firstname) {this.firstname = firstname;}

    public String getLastname() {return lastname;}

    public void setLastname(String lastname) {this.lastname = lastname;}

    public String getSsn() {return ssn;}

    public void setSsn(String ssn) {this.ssn = ssn;}

    public double getBalance() {return balance;}

    public void setBalance(double balance) {this.balance = balance;}




    // API

    public void deposit(double amount) {
        try {
            if (amount < 0) {
                throw new Exception ("Negatice amount Exception");
            }
            amount++;
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (!isntValid(ssn)) {
                throw new Exception("The ssn isn't valid");
            } else if (amount > balance) {
                throw new Exception("Insufficient balance exception");
            }
            balance -= amount;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double getAccountBalance() {
        return getAccountBalance();
    }

    public String accountToString() {
        return "(" + id + ", " + iban + ", " + firstname + ", " + lastname + ", " + ssn + ", " + balance + ")";
    }

    public Boolean isntValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}
