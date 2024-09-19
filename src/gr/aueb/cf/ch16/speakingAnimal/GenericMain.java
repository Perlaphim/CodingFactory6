package gr.aueb.cf.ch16.speakingAnimal;

public class GenericMain {

    public static void main(String[] args) {
        ISpeakable whiteCat = new Cat("Whitecat");
        ISpeakable blackDog = new Dog("Blackdog", 7);


        //Wiring
        GenericSpeakingSchool genericSpeakingSchool1 = new GenericSpeakingSchool(whiteCat);
        GenericSpeakingSchool genericSpeakingSchool2 = new GenericSpeakingSchool(blackDog);
    }
}
