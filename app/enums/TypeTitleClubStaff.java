package app.enums;

public enum TypeTitleClubStaff { // enums values for specific items that will never change 
    GROUND_STAFF(0), CLEANER(1), CARETAKER(2), PHISIO(3),
    MASSAGE_TERAPIST(4), DOCTOR(5), NUTRITIONIST(6), TEAM_MANAGER(7),
    HEAD_COACH(8), ASSISTANT_COACH(9), SCRUM_COACH(10), PERFORM_ANALYST(11),
    STRENGHT_CONDITIONING_COACHING(12), ASSISTANT_ATHLETIC_TRAINER(13);
    ;
    
    public int valueType; // controls variable to allow class to assign player positions 

    TypeTitleClubStaff(int value) {
        valueType = value;
    }
}
