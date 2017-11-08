
/**
 * Write a description of class Author here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Author
{
    private String name;
    private int age;
    
    public Author(String nm, int yr) {
        this.name = nm;
        this.age = yr;
    }
    
    public String toString() {
        return this.name + ", who is " + age + " years old.";
    }
    
}
