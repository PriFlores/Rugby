package app.build;
// Importing classes

import app.entity.CoachingStaff;
import app.entity.TrainingGroups;
import app.enums.WeekDay;
import random.NameTeamsGenerator;
import random.TeamsIdGenerator;
import java.util.ArrayList;
import java.util.Random;

public class BuildTrainingGroups { // building class
//method constructor to build the class

    public void builder(ArrayList<TrainingGroups> teams,
            ArrayList<CoachingStaff> coachings) { //creating an ArrayList
        Random r = new Random(); // creating an instance of Random
        WeekDay day = null; //null value attribute, to be changed later

        for (int i = 0; i < 50; i++) { // creating up to 50 teams
            TeamsIdGenerator TG = new TeamsIdGenerator(); // creating an instance of TeamsIdGenerator 
            TrainingGroups group = new TrainingGroups(); // creating an instance of TrainingGroups
            NameTeamsGenerator NT = new NameTeamsGenerator(); // creating an instance of NameTeamsGenerator
            group.setIdTrainingGroups(TG.getRandomTeam()); // using setters and getters to get the attributes of TrainingGroups
            group.setNameTrainingGroups(NT.getNameTeams()); // using setters and getters to get the attributes of TrainingGroups
            switch (i % 7) { // using the remainder to assign staff type to club staff
                case 0:
                    group.setTrainingdays(day.SUNDAY);
                    break;
                case 1:
                    group.setTrainingdays(day.MONDAY);
                    break;
                case 2:
                    group.setTrainingdays(day.TUESDAY);
                    break;
                case 3:
                    group.setTrainingdays(day.WEDNESDAY);
                    break;
                case 4:
                    group.setTrainingdays(day.THURSDAY);
                    break;
                case 5:
                    group.setTrainingdays(day.FRIDAY);
                    break;
                case 6:
                    group.setTrainingdays(day.SATURDAY);
                    break;
            }
            int lenght = coachings.size(); //represents the coaching size
            group.setCoach(coachings.get(i % lenght)); // sets the coach
            teams.add(group); // adding into ArrayList
        }
    }
}
