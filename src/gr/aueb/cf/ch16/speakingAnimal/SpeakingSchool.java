package gr.aueb.cf.ch16.speakingAnimal;

public class SpeakingSchool {
    private final Cat cat = new Cat();

    public SpeakingSchool() {}

    public void learnToSpeak() {
        cat.speak();
    }
}
