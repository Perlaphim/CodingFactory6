package gr.aueb.cf.ch20.prct.lambdas;

public class Teacher {
    private static int id;
    private static String firstname;
    private static String lastname;

    public Teacher() {}

    public Teacher(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public static String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void printFullName() {
        System.out.println(firstname + " " + lastname + " /" + id);
    }

    public static void printTeacher(Teacher t) {
        System.out.printf("ID: %d, Firstname: %s, Lastname: %s\n",getId(), getFirstname(), getLastname());
    }

    public String printFullname() {
        return "Teacher{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
