package gr.aueb.cf.ch25;

public class IterativeDateTimeServer extends Thread {

    public static void main(String[] args) {
        IterativeDateTimeServer dateTimeServer = new IterativeDateTimeServer();
        dateTimeServer.start();
    }
}
