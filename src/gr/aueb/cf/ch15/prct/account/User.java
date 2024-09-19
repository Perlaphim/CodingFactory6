package gr.aueb.cf.ch15.prct.account;

public class User extends IdentifiableEntity {
    private String firstName;
    private String lastName;
    private String ssn;

    public User() {}

    public User(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

//    Copy Constructor
    public User(User user) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "(firstName = " + firstName + ", lastName = " + lastName + ", ssn = " + ssn + ")";
    }
}
