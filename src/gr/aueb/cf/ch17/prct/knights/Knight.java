package gr.aueb.cf.ch17.prct.knights;

public class Knight implements IKnight{


    @Override
    public void embarkOnMission(IMission mission) {
        mission.embark();
    }
}
