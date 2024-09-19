package gr.aueb.cf.ch16.prct.ISpeakable;

public class GenericSpeakingSchool {
    private final ISpeakable speakable;

    public GenericSpeakingSchool(ISpeakable speakable){
        this.speakable = speakable;
    }

    public void speak(){
        speakable.speak();
    }
}
