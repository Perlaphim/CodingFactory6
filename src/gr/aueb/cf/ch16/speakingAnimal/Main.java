package gr.aueb.cf.ch16.speakingAnimal;

public class Main {

    public static void main(String[] args) {
        ISpeakable alice = new Cat("Alice");
        ISpeakable bob = new Dog("Bob", 7);


        alice.speak();
        bob.speak();
    }

    public static void doSpeak(ISpeakable speakable) {
        speakable.speak();
    }
}
