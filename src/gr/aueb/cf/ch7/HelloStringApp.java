package gr.aueb.cf.ch7;

public class HelloStringApp {

    public static void main(String[] args) {

        String s = "Alice";                     //length = 5, δλδ απο 0 - 4
        String bob = new String("Bob");  //Δεν συνηθίζεται, είναι προβληματικός

        System.out.println("Length of \"Alice\": " + s.length());
        System.out.println("Length of \"Bob\": " + bob.length());


    }
}
