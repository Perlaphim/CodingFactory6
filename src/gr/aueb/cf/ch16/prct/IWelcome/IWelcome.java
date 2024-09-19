package gr.aueb.cf.ch16.prct.IWelcome;

public interface IWelcome {

    void saySomething(String message);

    default void sayHelloCodingFactory() {
        System.out.println("Hello ");
        sayCodingFactory();
    }

    private void sayCodingFactory() {
        System.out.println("Coding Factory");
    }

    static void sayHelloCoding() {
        System.out.println("Hello ");
    }

    private static void sayCoding() {
        System.out.println("Coding");
    }
}
