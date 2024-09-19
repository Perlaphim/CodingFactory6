package gr.aueb.cf.ch17.knight;

public class Main {

    public static void main(String[] args) {
        Iknight joa = new Knight();
        Iknight saintGeorge = new Knight();

        joa.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Save the princess.");
            }
        });

        saintGeorge.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                killTheDragon();
            }
        });

        joa.embarkOnMission (() -> System.out.println("save the princess"));
        saintGeorge.embarkOnMission (() -> killTheDragon());


        saintGeorge.embarkOnMission (Main::killTheDragon);         //Method Reference        /Η (:) ειναι τελεστης εμβελειας
        joa.embarkOnMission (Main::saveThePrincess);

    }

    public static void saveThePrincess() {
        System.out.println("Save the princess.");
    }

    public static void killTheDragon() {
        System.out.println("kills the dragon");
    }
}
