package gr.aueb.cf.ch16.defaultMethods;

public class CodingFactory implements IWelcome{
    @Override
    public void saySomething(String message) {
        System.out.println("Hello World");
    }

    @Override
    public void sayHelloCoding() {
        IWelcome.super.sayHelloCoding();
        saySomething("\u2764".repeat(5));
    }
}
