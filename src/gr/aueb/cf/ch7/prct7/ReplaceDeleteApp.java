package gr.aueb.cf.ch7.prct7;

public class ReplaceDeleteApp {

    public static void main(String[] args) {
        String firstname = "Maria-Helen";
        String lastname;
        String simpleName;
        String nickname;
        String oneName;


        //Replace dash with whitespace
        simpleName = firstname.replace("-"," ");

        //Replace dash with empty String (firstname.length == 0)
        //Thus esentially deletes
        nickname = firstname.replace("-","");

        oneName = firstname.replace("-Helen","");
    }
}
