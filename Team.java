
/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables - replace the example below with your own
    private String teamName;
    private Athlete[] players;

    /**
     * Constructor for objects of class Team
     */
    public Team(String tn, int number)
    {
        this.teamName = tn;
        this.players = new Athlete[number];
    }

    public String toString() {
        String output = "The " + this.teamName + " has: \n";
        for (Athlete a : players) {
            output += a + "\n" ;
        }
        return output;
    }
    
    public void addPlayer(Athlete a, int i) {
        players[i] = a;
    }
}
