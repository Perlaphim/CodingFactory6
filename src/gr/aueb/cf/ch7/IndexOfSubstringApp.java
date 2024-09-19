package gr.aueb.cf.ch7;

/*
 * Demo of IndexOf(), Substring()
 */

public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";


        int positionOfO = s.indexOf('o');
        int positionOfNextO = s.indexOf('o', 2);
        int positionOfOry = s.indexOf("ory");
        System.out.println("Position of \'o\': " + positionOfO);
        System.out.println("Position of next \'o\': " + positionOfNextO);
        System.out.println("Position of next \'ory\': " + positionOfOry);



        String odToEnd = s.substring(1);
        System.out.println(odToEnd);

        String od = s.substring(1,3);
        System.out.println(od);
    }
}
