package app.rules;
// importing 
import app.entity.TrainingGroups;
import app.enums.WeekDay;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainingRules { // building class 

    public void listByWeekDay(ArrayList<TrainingGroups> players) throws Exception { // (case 4) constructor that is using the arraylist
        Scanner myInput = new Scanner(System.in);
        String day = "";

        System.out.println("Please enter a day: ");
        day = myInput.nextLine(); // reads the next line 
        if (day.matches("[ˆ\\d]+")) { // using regex pattern match 
            throw new Exception("You should have enter a week day, numbers are not an option"); // throws an exception for a invalid input
        }

        for (TrainingGroups player : players) { // for each loop used on club staff
            try {
                if (player.getTrainingdays().equals(WeekDay.valueOf(day.toUpperCase()))) { // if the value exits will print it out as below.
                    System.out.println("============================================================"); // designing the output
                    System.out.println("Training Group Id: " + player.getIdTrainingGroups()); // prints out the output with a disered attribute as a string
                    System.out.println("Trainin Group Name: " + player.getNameTrainingGroups());
                    System.out.println("Training day: " + player.getTrainingdays());
                    System.out.println("============================================================");
                }
            } catch (IllegalArgumentException e) { // it triggers if th value does not exists 
                System.out.println("This value is not a week day");
                break;
            }
        }
    }

    public void listAllTeams(ArrayList<TrainingGroups> players) { // (case 3) constructor that is using the arraylist
        for (int i = 0; i < players.size(); i++) { // loops through clubStaffList according to its size, to get all of its attributes
            System.out.println("============================================================"); // designing the output
            System.out.println("Training Group: " + players.get(i).getNameTrainingGroups()); // prints out the output with a disered attribute as a string
            System.out.println("Coach: " + players.get(i).getCoach().getNameStaff());
            System.out.println("Number of Player: " + players.get(i).getnPlayers());
            System.out.println("============================================================");
        }
    }
}
