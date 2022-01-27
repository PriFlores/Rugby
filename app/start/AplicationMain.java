package app.start;

/*
* please see below the details and proposal of this application****
* 
*The task of this application was to create a working program to demonstrate a “Rugby Club” as a prototype.
*The code was organised using the best professional practices such as: object-oriented and SOLID concepts.
*
*The project was organised with some packages,as follow:

*- app.start: here we have the main, which has the system menu.
*- app.build: here we have the classes which will build each entity.(factory)
*- app.entity: here we have the classes with the following entities and their attributes:
*Club Staff, Coaching Staff, Training Groups, Player
*- app.enums: here I have created enums for things that will not be changed as PlayersPositions, TypeTitleClubStaff and Weekday.
*- app.rules: here are all the rules, including the statements and conditions according each topic in the menu system.
*- app.random: here we have 4 random classes, which will help to randomise all the names and IDs requested in the task.

/*When the program is executed, it will output as follows:
*- At least 10 Club staff of various types. There must be at least:
*2 different types of Club staff, I have created 8 and it will repesat up to 10 times inside the loop.
*- At least 30 Coaching staff of various types (there must ONLY ONE Head Coach and at least 2
*other different types of coaching staff. As above, the 30 cannot all be the same type). 
*I have created 6 and it will repeat up to 30 inside the loop.
*I have created an enum called TypeTitleClubStaff for all title Staff.
*- At least 50 Groups. There must be at least 3 different types of Group. However, it was created with 7 groups as you can see inside the random package called NameTeamsGenerator.
* 
*-EXTRA CHALLENGE: Include at least 300 Players/club members.Was created a Player class and randomised the names. 
*Also created was an enum with the players positions.
*Each staff member must be given (a) a name, and (b) a UNIQUE staff number, which was randomised as asked.
*In addition, I created the Coaching Staff to have a Qualification Level that the number is between 1 and 4.
*And just the Head Coach is 5.
*Each Group must be given an identifier (e.g. U13A) and assigned a random number of “players” not more
*than 30 in a group. 
*[EXTRA CHALLENGE: Players was generated with appropriate properties. Name and age as asked, also Id, position and group training.
*Once all the entities have been created, the system was assigned a coach to each Group. Each coach must
*be assigned to at least one Group but it is allowed to have the same coach for several Groups, even if they
*are on the same day 
*[EXTRA CHALLENGE: was included a feature to generate the list of Players for each group]
*The user will be able to see the functionality of this application accessing the menu system in the code bellow:
*/
// importing all classes 
import app.build.BuildClubStaff;
import app.build.BuildCoachingStaff;
import app.build.BuildPlayers;
import app.build.BuildTrainingGroups;
import app.entity.ClubStaff;
import app.entity.CoachingStaff;
import app.entity.Player;
import app.entity.TrainingGroups;
import app.rules.ClubStaffRules;
import app.rules.PlayerRules;
import app.rules.TrainingRules;
import java.util.ArrayList;
import java.util.Scanner;

public class AplicationMain {

    public static void main(String[] args) { // creating an instance of an ArrayList
        ArrayList<ClubStaff> clubStaffList = new ArrayList<>();
        ArrayList<CoachingStaff> coachingStaffList = new ArrayList<>();
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<TrainingGroups> teams = new ArrayList<>();

        callBuilderClubStaff(clubStaffList); // calling all the methods that builds the menu itens 
        callBuilderCoachingStaff(clubStaffList, coachingStaffList);
        callBuilderTrainingGroups(teams, coachingStaffList);
        callBuilderPlayers(players, teams);

        menu(clubStaffList, players, teams, coachingStaffList); // Initializing the menu system, caling the ArrayLists
    }

    private static void menu(ArrayList<ClubStaff> clubStaffList, ArrayList<Player> players, ArrayList<TrainingGroups> teams,ArrayList<CoachingStaff> coachingStaffList) {
        // constructing a static menu function 
        try {
            int menSel;//user selection variable

            do {
                menSel = menuSelection();
                switch (menSel) { // using switch for user selection
                    case 1:
                        new ClubStaffRules().listAllClubStaff(clubStaffList); // creating an instance of methods held in app.rules
                        break;
                    case 2:
                        new ClubStaffRules().listByCategory(clubStaffList);// creating an instance of methods held in app.rules
                        break;
                    case 3:
                        new TrainingRules().listAllTeams(teams);// creating an instance of methods held in app.rules
                        break;
                    case 4:
                        new TrainingRules().listByWeekDay(teams);// creating an instance of methods held in app.rules
                        break;
                    case 5:
                        new PlayerRules().listPlayerByGroup(players);// creating an instance of methods held in app.rules
                        break;
                    case 6:
                        new PlayerRules().listPlayerByCoach(players, coachingStaffList);// creating an instance of methods held in app.rules
                        break;
                    case 7:
                        new PlayerRules().listAllPlayer(players);// creating an instance of methods held in app.rules
                        break;
                    case 8:// typing 8 leaves the menu system
                        System.out.println("See you soon");
                        break;
                    default:
                        System.out.println("Invalid input try again");// default invalidates any other input 
                        break;
                }
            } while (menSel != 8);// Ends the program once 8 is selected 
        } catch (Exception e) { // will catch all the exceptions
            e.printStackTrace();// will print out the location of the exceptions
        }
    }

    public static int menuSelection() {// constructor for the user interface
        Scanner myInput = new Scanner(System.in);
        int menuSel;// initializing a value for the user input

        System.out.println("******************** Menu system ********************");
        System.out.println("Please Select an option");
        System.out.println("1) To see all staff.");
        System.out.println("2) To see staff by a category.");
        System.out.println("3) To see all groups with their coaches and the number of players per group.");
        System.out.println("4) To see training days for each group");
        System.out.println("5) To see all players per group");
        System.out.println("6) To see the players coached by a particular coach");
        System.out.println("7) To see all players in the club");
        System.out.println("8) Exit");
        System.out.println("*****************************************************");

        menuSel = myInput.nextInt();

        return menuSel;// returns to activate the switch statement 
    }

    private static void callBuilderClubStaff(ArrayList<ClubStaff> clubStaffList) {// constructor to call the builder from different package 
        BuildClubStaff bcs = new BuildClubStaff();
        bcs.builder(clubStaffList);
    }

    private static void callBuilderCoachingStaff(ArrayList<ClubStaff> clubStaffList, 
                                                 ArrayList<CoachingStaff> coachings) { // constructor to call the builder from different package 
        BuildCoachingStaff bco = new BuildCoachingStaff();
        bco.builder(clubStaffList, coachings);
    }

    private static void callBuilderPlayers(ArrayList<Player> players, ArrayList<TrainingGroups> teams) {// constructor to call the builder from different package 
        BuildPlayers bp = new BuildPlayers();
        bp.builder(players, teams);
    }

    private static void callBuilderTrainingGroups(ArrayList<TrainingGroups> players,
                                                  ArrayList<CoachingStaff> coachingStaffList) {// constructor to call the builder from different package 
        BuildTrainingGroups btg = new BuildTrainingGroups();
        btg.builder(players, coachingStaffList);
    }
}