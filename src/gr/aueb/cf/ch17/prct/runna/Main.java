package gr.aueb.cf.ch17.prct.runna;

public class Main {
    private final static Runnable joa = new Knight("Joa");
    private final static Runnable whiteKnight = new Knight("White Knight");
    private final static Runnable blackKnight = new Knight("Black Knight");

    public static void main(String[] args) {
        (new Thread(joa)).start();
        (new Thread(whiteKnight)).start();
        (new Thread(blackKnight)).start();
    }
}
