package gr.aueb.cf.ch8.prct;

public class FinallyApp {

    public static void main(String[] args) {
        int num = 12;
        try {
            if (num == 12) throw new Exception();
        } catch (Exception e) {
            return;
        } finally {
            System.out.println("Coding Factory is always excecuted");
        }

        System.out.println("This piece of code is not always executed");
    }
}
