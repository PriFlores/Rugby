package app.rules;
// importing classes
import app.entity.Player;
import app.entity.CoachingStaff;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayerRules { // building class

    public void listPlayerByGroup(ArrayList<Player> players) throws Exception { // (case 5) constructor that is using the arraylist
        Scanner myInput = new Scanner(System.in); // creating an instance of Scanner
        String group;
        System.out.println("Enter a group: ");
        group = myInput.nextLine();// reads the next line 
        if (group.matches("[ˆ\\d]+")) { // using regex pattern match 
            throw new Exception("You should have enter a group name, numbers are not an option");
        } // throws an exception for a invalid input

        for (Player player : players) { // for each loop used on club staff
            try {
                if (player.getTraining().getNameTrainingGroups().equalsIgnoreCase(group)) { // if the value exits will print it out as below.
                    System.out.println("============================================================");// designing the output
                    System.out.println("Id: " + player.getIdPlayer());// prints out the output with a disered attribute as a string
                    System.out.println("Name: " + player.getNamePlayer());
                    System.out.println("Position: " + player.getPositionPlayer());
                    System.out.println("Trainig Group: " + player.getTraining().getNameTrainingGroups().toString());
                    System.out.println("============================================================");// designing the output
                    
                }
            } catch (IllegalArgumentException e) { // it triggers if th value does not exists 
                System.out.println("Invalid input, please enter a group name");
                break;
            }
        }
    }

    public void listPlayerByCoach(ArrayList<Player> players,ArrayList<CoachingStaff> coaches) { //(case 6) // constructor that is using the arraylist
        System.out.println("********** [Coaches name] **********"); // prints out the output with a disered attribute as a string
       
        for (CoachingStaff coach: coaches) { // for each loop used on club staff
            System.out.println(coach.getNameStaff());
        }
        System.out.println("");
        System.out.println("============================================================");// designing the output
        Scanner myInput = new Scanner(System.in); // creating an instance of Scanner
        String coach;
        System.out.println("Enter a coach name: ");
        coach = myInput.nextLine(); // reads the next line 

        for (Player player : players) { // for each loop used on club staff
            try {
                if (player.getTraining().getCoach().getNameStaff().equalsIgnoreCase(coach)) {
                    System.out.println("============================================================");// designing the output
                    System.out.println("Id: " + player.getIdPlayer()); // prints out the output with a disered attribute as a string
                    System.out.println("Name: " + player.getNamePlayer());
                    System.out.println("Age: " + player.getAgePlayer());
                    System.out.println("Coached by: " + player.getTraining().getCoach().getNameStaff());
                    System.out.println("============================================================");// designing the output
                    
                }
            } catch (IllegalArgumentException e) { // it triggers if th value does not exists 
                System.out.println("Invalid input, please enter a coach name");
                break;
            }
        }
    }

    public void listAllPlayer(ArrayList<Player> players) { // (case 7) constructor that is using the arraylist
        for (int i = 0; i < players.size(); i++) {
            System.out.println("============================================================");// designing the output
            System.out.println("Id: " + players.get(i).getIdPlayer());
            System.out.println("Name: " + players.get(i).getNamePlayer());
            System.out.println("Age: " + players.get(i).getAgePlayer());
            System.out.println("Position: " + players.get(i).getPositionPlayer());
            System.out.println("Training group: " + players.get(i).getTraining().getNameTrainingGroups());
            System.out.println("============================================================");// designing the output       
        }
    }
}
