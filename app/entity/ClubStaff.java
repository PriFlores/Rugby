package app.entity;
// importing classes

import app.enums.TypeTitleClubStaff;

public class ClubStaff { // building class

// attributes
    private long idClubStaff; // Private keyword protects the base attributes to assist with speeds and security
    private String nameStaff;
    private TypeTitleClubStaff titleStaff;
//using setters to assign a value into the attributes
//using getters to retrieve the value from the attributes

    public Long getIdClubStaff() {
        return idClubStaff;
    }

    public void setIdClubStaff(Long idClubStaff) {
        this.idClubStaff = idClubStaff;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public TypeTitleClubStaff getTitleStaff() {
        return titleStaff;
    }

    public void setTitleStaff(TypeTitleClubStaff titleStaff) {
        this.titleStaff = titleStaff;
    }

    @Override
    public String toString() { // to string override for the club staff attributes
        return "ClubStaff{" + "idClubStaff=" + idClubStaff // will print out in this format 
                + ", nameStaff=" + nameStaff + ", titleStaff=" + titleStaff + '}';
    }

}
