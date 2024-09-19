package gr.aueb.cf.ch17.prct.runna;


public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus missionStatus);
    void embark();
}
