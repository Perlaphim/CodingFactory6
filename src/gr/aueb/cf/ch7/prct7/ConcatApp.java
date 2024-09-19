package gr.aueb.cf.ch7.prct7;

public class ConcatApp {

    public static void main(String[] args) {
        String firstname = "Pavlos";
        String lastname = "Hatzigeorgiou";
        String title = "Dr.";
        String fullname1, fullname2, fullname3, fullname4;


        // + operator is overloaded in Java
        // When applied to Strings its considered a concat

        fullname1 = firstname + lastname;
        fullname2 = title + firstname + lastname;

        fullname3 = firstname.concat(lastname);
        fullname4 = title.concat(firstname).concat(lastname);
    }
}
