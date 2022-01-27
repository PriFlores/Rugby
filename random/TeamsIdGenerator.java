package random;
// importing random class 
import java.util.Random;

public class TeamsIdGenerator {

    protected String[] Team = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "F", "G", "H", "I", "J", "L", "M", "N", "O", "P", "Q", "R", "T", "U", "V", "X", "Z"};

    protected int[] Nteam = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41,
        42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60};

    public String getRandomTeam() {
        //return a random team ID, it will mix an ID with numbers and letters 
        Random r = new Random();

        //pick a Id based on length of array
        String tid1 = this.Team[r.nextInt(Team.length)];
        int nt = this.Nteam[r.nextInt(Nteam.length)];
        String tid2 = this.Team[r.nextInt(Team.length)];
        return (tid1 + nt + tid2);
    }
}
