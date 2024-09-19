package gr.aueb.cf.ch16.prct.IWelcome;

public class CodingFactory implements IWelcome{

    @Override
    public void saySomething(String message) {
        System.out.println("Please read the message: " + message);
    }

    @Override
    public void sayHelloCodingFactory() {
        IWelcome.super.sayHelloCodingFactory();
        System.out.println("\u2764".repeat(5));
    }
}
