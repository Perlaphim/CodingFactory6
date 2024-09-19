package gr.aueb.cf.ch16.defaultMethods;

public interface IWelcome {

    void saySomething(String message);


    default void sayHelloCoding() {
        System.out.println("Hello");
    }

    private void sayCoding() {
        System.out.println("Coding");
    }

    static void sayHelloCF() {
        System.out.println("Hello");
    }

    private static void saCF() {
        System.out.println("CF");
    }
}
