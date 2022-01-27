package app.entity;
// importing class

public class CoachingStaff extends ClubStaff { // building class using the same attributes from the parent class 

//also, coachingStaff has this additional attribute
    private int level; // Private keyword protects the base attributes to assist with speeds and security
//using setters to assign a value into the attributes
//using getters to retrieve the value from the attributes

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() { // to string override for the club staff attributes
        return "CoachingStaff{" + "" //// will print out in this format 
                + "idClubStaff=" + getIdClubStaff()
                + ", nameStaff=" + getNameStaff()
                + ", titleCoachingStaff=" + getTitleStaff()
                + ", level=" + level + '}';
    }

}
