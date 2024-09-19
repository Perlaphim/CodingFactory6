package gr.aueb.cf.ch17.prct.knights;

public class PlayTheGame3 {

    public static void main(String[] args) {

        IKnight joa = new Knight();
        IKnight saintGeorge = new Knight();

        joa.embarkOnMission(PlayTheGame3::saveThePrincess);
        saintGeorge.embarkOnMission(PlayTheGame3::slayTheDragon);
    }

    public static void slayTheDragon() {
        System.out.println("Slay the dragon");
    }

    public static void saveThePrincess() {
        System.out.println("Save the princess");
    }
}
