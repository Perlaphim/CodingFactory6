package gr.ergasies.erg14.ask1;

public class Logger {

    private static final Logger INSTANCE = new Logger();

    private Logger() {}

    public static Logger getInstance() {
        return INSTANCE;
    }

    public void logMessage(String msg) {
        System.err.println(msg);
        System.out.println(System.currentTimeMillis());
    }
}
