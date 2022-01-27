package app.build;
// importing classes

import java.util.ArrayList;
import random.NameRandomGenerator;
import app.enums.PlayersPositions;
import app.entity.Player;
import app.entity.TrainingGroups;
import java.util.Random;

public class BuildPlayers { // building class
//method constructor to build the class

    public void builder(ArrayList<Player> clubMember, ArrayList<TrainingGroups> teams) { //creating ArrayLists
        NameRandomGenerator randomName = new NameRandomGenerator();// creating an instance of RandomGenerator
        PlayersPositions type = null; //null value attribute, to be changed later
        Random r = new Random(); // creating an instance of random 

        for (int i = 0; i < 300; i++) { // creating up to 300 players
            Player member = new Player(); // creating an instance of Player
            member.setIdPlayer((long) i + 1); // using setters and getters to get the attributes of Player 
            member.setNamePlayer(randomName.getRandomName()); // using setters and getters to get the attributes of Player 
            member.setAgePlayer(r.nextInt(31) + 10);// using setters and getters to get the attributes of Player, the maximum age will be 40
            switch (i % 14) { // using the remainder to assign positions into Player
                case 0:
                    member.setPositionPlayer(type.LOOSEHEAD_PROP);
                    break;
                case 1:
                    member.setPositionPlayer(type.TIGHTHEAD_PROP);
                    break;
                case 2:
                    member.setPositionPlayer(type.HOOKER);
                    break;
                case 3:
                    member.setPositionPlayer(type.SECOND_ROW);
                    break;
                case 4:
                    member.setPositionPlayer(type.BLIND_SIDE_FLANKER);
                    break;
                case 5:
                    member.setPositionPlayer(type.OPEN_SIDE_FLANKER);
                    break;
                case 6:
                    member.setPositionPlayer(type.NUMBER_8);
                    break;
                case 7:
                    member.setPositionPlayer(type.SERUM_HALF);
                    break;
                case 8:
                    member.setPositionPlayer(type.FLY_HALF);
                    break;
                case 9:
                    member.setPositionPlayer(type.RIGHT_SID_WING);
                    break;
                case 10:
                    member.setPositionPlayer(type.LEFT_SIDE_WING);
                    break;
                case 11:
                    member.setPositionPlayer(type.INSIDE_CENTER);
                    break;
                case 12:
                    member.setPositionPlayer(type.OUTSIDE_CENTER);
                    break;
                case 13:
                    member.setPositionPlayer(type.FULL_BACK);
                    break;
            }
            int lenght = teams.size(); //represents the team size
            member.setTraining(teams.get(i % lenght)); // sets the training group 
            teams.get(i % lenght).addPlayer();//gets the teams and adds players according with the lenght of the list 
            clubMember.add(member); // adding a member into a clubMember ArrayList
        }
    }
}
