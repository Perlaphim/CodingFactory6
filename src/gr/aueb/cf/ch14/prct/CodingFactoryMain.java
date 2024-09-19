package gr.aueb.cf.ch14.prct;

public class CodingFactoryMain {

    public static void main(String[] args) {
        CodingFactory codingFactory = CodingFactory.getInstance();
        codingFactory.sayHello();
    }
}
