package gr.aueb.cf.ch17.prct.knights;

public class PlayTheGame2 {

    public static void main(String[] args) {

        IKnight joa = new Knight();
        IKnight saintGeorge = new Knight();

        joa.embarkOnMission(() -> System.out.println("Save the princess"));
        saintGeorge.embarkOnMission(() -> slayTheDragon());
    }

    public static void slayTheDragon() {
        System.out.println("Slay the dragon");
    }
}
