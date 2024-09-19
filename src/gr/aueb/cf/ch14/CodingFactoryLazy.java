package gr.aueb.cf.ch14;

public class CodingFactoryLazy {

    private static CodingFactoryLazy Instance = null;

    private CodingFactoryLazy() {

    }

    public static CodingFactoryLazy getInstance() {
        if (Instance == null) {
            Instance = new CodingFactoryLazy();
        }
        return Instance;
    }

    public void sayHello() {
        System.out.println("Hello CF6");
    }

}
