package gr.aueb.cf.ch17.prct.knights;

public class PlayTheGame {

    public static void main(String[] args) {

        IKnight joa = new Knight();
        IKnight saintGeorge = new Knight();

        joa.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Save the princess");
            }
        });


        saintGeorge.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                slayTheDragon();
            }
        });
    }

    public static void slayTheDragon() {
        System.out.println("Slay the dragon");
    }
}
