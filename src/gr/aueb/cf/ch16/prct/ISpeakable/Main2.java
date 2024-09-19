package gr.aueb.cf.ch16.prct.ISpeakable;

public class Main2 {

    public static void main(String[] args) {
        ISpeakable whiteCat = new Cat("White Cat");
        ISpeakable blackDog = new Cat("Black Dog");

        GenericSpeakingSchool aliceSpeakingSchool = new GenericSpeakingSchool(whiteCat);
        GenericSpeakingSchool bobSpeakingSchool = new GenericSpeakingSchool(blackDog);
    }
}
