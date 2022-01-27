package app.build;
//importing classes 

import app.entity.ClubStaff;
import app.enums.TypeTitleClubStaff;
import java.util.ArrayList;
import random.IdStaffRandomGenerator;
import random.NameRandomGenerator;

public class BuildClubStaff { //building class

//method constructor to build the class
    public void builder(ArrayList<ClubStaff> clubStaffer) {//creating an ArrayList
        NameRandomGenerator randomName = new NameRandomGenerator();// creating an instance of RandomGenerator 
        TypeTitleClubStaff type = null; //null value attribute, to be changed later
        IdStaffRandomGenerator randomNumber = new IdStaffRandomGenerator();// creating an instance of RandomID

        for (int i = 0; i < 10; i++) { // creating up to 10 club staff
            ClubStaff staff = new ClubStaff(); // creating an instance of ClubStaff
            staff.setIdClubStaff(randomNumber.getRandomNumber());// using setters and getters to get the attributes of club staff 
            staff.setNameStaff(randomName.getRandomName()); //using setters and getters to get the attributes of club staff

            switch (i % 8) { // using the remainder to assign staff type to club staff
                case 0:
                    staff.setTitleStaff(type.CARETAKER);
                    break;
                case 1:
                    staff.setTitleStaff(type.CLEANER);
                    break;
                case 2:
                    staff.setTitleStaff(type.DOCTOR);
                    break;
                case 3:
                    staff.setTitleStaff(type.GROUND_STAFF);
                    break;
                case 4:
                    staff.setTitleStaff(type.MASSAGE_TERAPIST);
                    break;
                case 5:
                    staff.setTitleStaff(type.NUTRITIONIST);
                    break;
                case 6:
                    staff.setTitleStaff(type.PHISIO);
                    break;
                case 7:
                    staff.setTitleStaff(type.TEAM_MANAGER);
                    break;
            }

            clubStaffer.add(staff); // adding a club staff into a clubStaff ArrayList

        }

    }

}
