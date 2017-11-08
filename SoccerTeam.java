
/**
 * Write a description of class AHSLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SoccerTeam
{
    public static void main(String[] args) {
        Team aca = new Team ("Acalanes Dons", 20);
        Athlete rob = new Athlete("Robbie Rowell", 17);
        aca.addPlayer(rob, 0);
        System.out.println(aca);
    }
}
