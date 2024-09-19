package gr.aueb.cf.ch3.xmpls;

/**
 * ειδικές μορφές while
 */
public class SpecialWhileFormsApp {

    public static void main(String[] args) {
        int i = 1;

        while (i<=0){
            System.out.println("Never gives in");
            i++;
        }

        while (i<=1){
            System.out.println("Gives only once");
        }

        while (true){
            System.out.println("I'm Eternal!");
            i++;
        }
    }
}
