package app.entity;
//importing classes

import app.enums.PlayersPositions;

public class Player { // building class
// attributes

    private long idPlayer; // Private keyword protects the base attributes to assist with speeds and security
    private String namePlayer;
    private int agePlayer;
    private PlayersPositions positionPlayer;
    private TrainingGroups training;
//using setters to assign a value into the attributes
//using getters to retrieve the value from the attributes

    public long getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(long idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int getAgePlayer() {
        return agePlayer;
    }

    public void setAgePlayer(int agePlayer) {
        this.agePlayer = agePlayer;
    }

    public PlayersPositions getPositionPlayer() {
        return positionPlayer;
    }

    public void setPositionPlayer(PlayersPositions positionPlayer) {
        this.positionPlayer = positionPlayer;
    }

    public TrainingGroups getTraining() {
        return training;
    }

    public void setTraining(TrainingGroups training) {
        this.training = training;
    }

    @Override
    public String toString() { // to string override for the club staff attributes
        return "Player{" + "idPlayer=" + idPlayer // will print out in this format 
                + ", namePlayer=" + namePlayer + ", agePlayer=" + agePlayer
                + ", positionPlayer=" + positionPlayer
                + ", training=" + training.getNameTrainingGroups() + '}';
    }

}
