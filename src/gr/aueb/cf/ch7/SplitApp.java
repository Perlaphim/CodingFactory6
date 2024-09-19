package gr.aueb.cf.ch7;

public class SplitApp {

    public static void main(String[] args) {
        String s = "Athens             Uni Of        Econ And    Business";

        String[] tokens = s.split("\\s+"); //το + βοηθα στο να αναγνωριστεί το πλήθος ενός συμβόλου και το παραβλ.

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
