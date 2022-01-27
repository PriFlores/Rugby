package app.entity;
// importing class

import app.enums.WeekDay;

public class TrainingGroups { // building class 
// attributes

    private String idTrainingGroups; // Private keyword protects the base attributes to assist with speeds and security
    private String nameTrainingGroups;
    private CoachingStaff coach;
    private WeekDay trainingdays;
    private int nPlayers;
//using setters to assign a value into the attributes
//using getters to retrieve the value from the attributes

    public String getIdTrainingGroups() {
        return idTrainingGroups;
    }

    public void setIdTrainingGroups(String idTrainingGroups) {
        this.idTrainingGroups = idTrainingGroups;
    }

    public String getNameTrainingGroups() {
        return nameTrainingGroups;
    }

    public void setNameTrainingGroups(String nameTrainingGroups) {
        this.nameTrainingGroups = nameTrainingGroups;
    }

    public CoachingStaff getCoach() {
        return coach;
    }

    public void setCoach(CoachingStaff coach) {
        this.coach = coach;
    }

    public WeekDay getTrainingdays() {
        return trainingdays;
    }

    public void setTrainingdays(WeekDay trainingdays) {
        this.trainingdays = trainingdays;
    }

    public int getnPlayers() {
        return nPlayers;
    }

    public void setnPlayers(int nPlayers) {
        this.nPlayers = nPlayers;
    }

    public void addPlayer() {
        nPlayers++;
    }

    @Override
    public String toString() { // to string override for the club staff attributes
        return "TrainingGroups{" + "idTrainingGroups=" + idTrainingGroups // will print out in this format 
                + ", nameTrainingGroups=" + nameTrainingGroups
                + ", coach=" + coach.getNameStaff()
                + ", trainingdays=" + trainingdays
                + ", nPlayers=" + nPlayers + '}';
    }
}
