package random;
// importing random class
import java.util.Random;

public class NameTeamsGenerator {

    protected String[] NameT = {"A squad", "B squad", "C squad", "D squad", "Under 13 squad",
        "female squad", "Under 13 female squad"};

    public String getNameTeams() {
        //return a random Team name

        Random r = new Random();

        //pick a name based on length of array
        String nameteam = this.NameT[r.nextInt(NameT.length)];
        return (nameteam);
    }
}
