package gr.ergasies.erg13.bankapp.model;

public class JointAccount {

    private String firstname1;
    private String firstname2;
    private String lastname1;
    private String lastname2;
    private String ssn1;
    private String ssn2;
    private String accountID;


    public JointAccount () {

    }

    public JointAccount(String firstname1, String firstname2, String lastname1, String lastname2, String ssn1, String ssn2, String accountID) {
        this.firstname1 = firstname1;
        this.firstname2 = firstname2;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
        this.ssn1 = ssn1;
        this.ssn2 = ssn2;
        this.accountID = accountID;
    }

    public String getFirstname1() {
        return firstname1;
    }

    public void setFirstname1(String firstname1) {
        this.firstname1 = firstname1;
    }

    public String getFirstname2() {
        return firstname2;
    }

    public void setFirstname2(String firstname2) {
        this.firstname2 = firstname2;
    }

    public String getSsn1() {
        return ssn1;
    }

    public void setSsn1(String ssn1) {
        this.ssn1 = ssn1;
    }

    public String getSsn2() {
        return ssn2;
    }

    public void setSsn2(String ssn2) {
        this.ssn2 = ssn2;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    @Override
    public String toString() {
        return "('" + lastname1 + ", " + firstname1 + "', ssn= " + ssn1 + ")\n" +
                "('" + lastname2 + ", " + firstname2 + "', ssn= " + ssn2 + ")";
    }
}
