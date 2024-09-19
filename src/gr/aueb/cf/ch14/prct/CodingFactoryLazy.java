package gr.aueb.cf.ch14.prct;

public class CodingFactoryLazy {
    private static CodingFactoryLazy SINGLETON = null;

    private CodingFactoryLazy() {}

    public static CodingFactoryLazy getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new CodingFactoryLazy();
        }
        return SINGLETON;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
