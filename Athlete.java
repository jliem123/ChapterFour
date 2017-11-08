
/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;
    
    
    /**
     * Constructor for objects of class Athlete
     */
    public Athlete(String nm, int num)
    {
        this.name = nm;
        this.age = num;
    }

    public String toString() {
        return "Player " + this.name + " is " + this.age + " years old.";
    }
    
    public void setAge(int newAge) {
        this.age = newAge;
    }
}
