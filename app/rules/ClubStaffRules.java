package app.rules;
// importing classes  
import app.build.BuildClubStaff;
import app.entity.ClubStaff;
import app.enums.TypeTitleClubStaff;
import java.util.ArrayList;
import java.util.Scanner;

public class ClubStaffRules { // building class 

    public ClubStaffRules() { // constructor for class rules
        BuildClubStaff bcs = new BuildClubStaff(); // creating an instance of BuildClubStaff 
        bcs.builder(new ArrayList<>()); // / creating an instance of a new ArrayList
    }
// constructor that is using the arraylist created above as parameter
    public void listAllClubStaff(ArrayList<ClubStaff> clubStaffList) { // (case 1) 
        for (int i = 0; i < clubStaffList.size(); i++) { // loops through clubStaffList according to its size, to get all of its attributes
           System.out.println("============================================================");// designing the output
           System.out.println("Id: " + clubStaffList.get(i).getIdClubStaff().toString());// prints out the output with a disered attribute as a string 
           System.out.println("Name: " + clubStaffList.get(i).getNameStaff().toString());
           System.out.println("Title: " + clubStaffList.get(i).getTitleStaff().toString());
           }
    }
    public void listByCategory(ArrayList<ClubStaff> clubStaffList) throws Exception { //(case 2) // constructor that is using the arraylist
        Scanner myInput = new Scanner(System.in);
        String category;

        System.out.println("Please enter a category: ");
        category = myInput.nextLine(); // reads the next line 
        if (category.matches("[ˆ\\d]+")) { // using regex pattern match 
            throw new Exception("You should have enter a Title Club Staff, numbers are not an option"); // throws an exception for a invalid input
        }
        for (ClubStaff club : clubStaffList) { // for each loop used on club staff
            try {
                if (club.getTitleStaff().equals(TypeTitleClubStaff.valueOf(category.toUpperCase().replace(" ", "_")))) {// if the value exits will print it out as below.
                    System.out.println("============================================================"); // designing the output
                    System.out.println("Id: " + club.getIdClubStaff()); // prints out the output with a disered attribute as a string
                    System.out.println("Name: " + club.getNameStaff()); 
                    System.out.println("Title: " + club.getTitleStaff()); 
                }
            } catch (IllegalArgumentException e) { // it triggers if th value does not exists 
                System.out.println("This value does not exist in Club Staff");
                break;
            }
        } 
          System.out.println("============================================================");
    }
}
