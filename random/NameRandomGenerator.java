package random;
// importing Random class
import java.util.Random;

public class NameRandomGenerator {

    protected String[] FirstName = {"Liam", "Olivia", "Noah", "Emma", "Oliver", "Ava", "Elijah", "Charlotte",
        "William", "Sophia", "James", "Amelia", "Benjamin", "Isabella", "Lucas", "Mia", "Henry", "Evelyn", "Alexander",
        "Freya", "Willow", "Evie", "Lily", "Grace", "Rosie", "Daisy", "Ivy", "Emily", "Florence", "Poppy",
        "Elsie", "Sophia", "Leo", "Theo", "Arthur", "Freddie", "Harry", "Charlie", "Jack", "Archie", "Oscar", "Henry",
        "Alfie", "Jacob", "Finley", "Teddy", "Tommy", "Thomas", "Lucas", "Roman", "Arlo", "Isaac", "Max", "Theodore",
        "Elijah", "Albie", "Mason", "Logan", "Joshua", "Harrison", "James", "William", "Ethan", "Reuben", "Reggie",
        "Rory", "Alexander", "Louie", "Luca", "Hunter", "Ezra", "Ronnie", "Sebastian", "Adam", "Hugo", "Jude", "Hudson",
        "Dylan", "Alex", "Zachary", "Jaxon", "Joseph", "Benjamin", "Edward", "Grayson", "Ollie", "Oakley", "Toby", "Louis",
        "Riley", "Caleb", "Daniel", "Rowan", "Carter", "Ellis", "Chester", "Blake", "Bobby", "Frankie", "Finn", "Jackson",
        "Harvey", "Jake", "Jenson", "Lewis", "Elliot", "Kai", "Nathan", "Samuel", "Albert", "Elliott", "Jasper", "Eli",
        "Cody", "Myles", "Ryan", "Ralph", "Michael", "Yusuf", "Jayden", "Stanley", "Brody", "Gabriel"};

    protected String[] Surname = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis",
        "Rodriguez", "Martinez", "Flores", "Silva", "Souza", "Cardoso", "O’Brien", "Santos", "Roche", "O’Grady", "O’Connel",
        "Lopez", "Saramago", "Camargo", "Bassa", "Murphy", "Soarez", "MacDonald", "Bophis", "Obama", "Cyrus", "Aguilera",
        "Timberland", "Sampaio", "Fonseca", "Viotto", "Rangel", "Bueno", "Ohashi", "Bortolotti", "Fernandes", "Ribeiro",
        "Zummach", "Hughes", "Thompson", "Green", "Martin"};

    public NameRandomGenerator() {

    }

    public String getRandomName() {
        //return a random name

        Random r = new Random();

        //pick a firstname and surname based on length of array
        String fname = this.FirstName[r.nextInt(FirstName.length)];
        String sname = this.Surname[r.nextInt(Surname.length)];

        return (fname + " " + sname);
    }
}
