package gr.aueb.cf.ch16.prct.ISpeakable;

public class Main {

    public static void main(String[] args) {
        ISpeakable alice = new Cat ("Alice");
        ISpeakable bob = new Dog ("Bob");


//        alice.speak();
//        Bob.speak();

        doSpeak(alice);
        doSpeak(bob);
    }

    public static void doSpeak(ISpeakable speakable) {
        speakable.speak();
    }
}
