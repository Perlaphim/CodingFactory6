package gr.aueb.cf.ch16.defaultMethods;

public class Main {

    public static void main(String[] args) {
        IWelcome welcomeCF = new CodingFactory();

        welcomeCF.sayHelloCoding();
        welcomeCF.saySomething("Hello all!");
    }
}
