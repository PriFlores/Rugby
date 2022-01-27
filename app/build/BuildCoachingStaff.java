package app.build;
// import classes 

import app.entity.ClubStaff;
import app.entity.CoachingStaff;
import app.enums.TypeTitleClubStaff;
import java.util.ArrayList;
import java.util.Random;
import random.NameRandomGenerator;
import random.IdStaffRandomGenerator;

public class BuildCoachingStaff { // buiding class
//method constructor to build the class

    public void builder(ArrayList<ClubStaff> clubStaff, ArrayList<CoachingStaff> coachings) {//creating ArrayLists
        NameRandomGenerator randomName = new NameRandomGenerator();// creating an instance of RandomGenerator 
        TypeTitleClubStaff type = null;//null value attribute, to be changed later
        Random r = new Random();// creating an instance of random 
        IdStaffRandomGenerator randomNumber = new IdStaffRandomGenerator(); // creating an instance of RandomID

        CoachingStaff staff;
// methods
        staff = new CoachingStaff(); // creating an instance of Coaching Staff
        staff.setIdClubStaff(randomNumber.getRandomNumber()); // using setters and getters to get the attributes of coaching staff 
        staff.setNameStaff(randomName.getRandomName());// using setters and getters to get the attributes of coaching staff 
        staff.setTitleStaff(type.HEAD_COACH); // setting Head coach
        staff.setLevel(5); // assigning level 5 to head coach 
        clubStaff.add(staff); // adding a coach staff into a club Staff ArrayList
        coachings.add(staff); // adding a coach staff into a coachings ArrayList
        for (int i = 0; i < 30; i++) { // creating up to 30 coaching staff
            staff = new CoachingStaff(); // creating an instance of Coaching staff
            staff.setIdClubStaff(randomNumber.getRandomNumber()); // using setters and getters to get the attributes of club staff 
            staff.setNameStaff(randomName.getRandomName()); // using setters and getters to get the attributes of club staff 
            switch (i % 5 + 9) {  // using the remainder to assign staff type to club staff
                case 9:
                    staff.setTitleStaff(type.ASSISTANT_COACH);
                    coachings.add(staff); // adding a coach staff into a coachings ArrayList
                    break;
                case 10:
                    staff.setTitleStaff(type.SCRUM_COACH);
                    break;
                case 11:
                    staff.setTitleStaff(type.PERFORM_ANALYST);
                    break;
                case 12:
                    staff.setTitleStaff(type.STRENGHT_CONDITIONING_COACHING);
                    break;
                case 13:
                    staff.setTitleStaff(type.ASSISTANT_ATHLETIC_TRAINER);
                    break;

            }
            staff.setLevel(r.nextInt(3) + 1); // setting the level for others coaching staff
            clubStaff.add(staff); // adding a club staff into a clubStaff ArrayList
        }
    }
}
