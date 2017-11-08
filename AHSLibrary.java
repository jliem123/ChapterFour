
/**
 * Write a description of class AHSLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AHSLibrary
{
    public static void main(String[] args) {
        Library ahs = new Library ("Acalanes", 10);
        
        Author jim = new Author("Jim Halpert", 23);
        Book java = new Book (jim, "Java");
        ahs.addBook(java, 0);
        
        Author ryan = new Author("Ryan Siu", 17);
        Book poop = new Book (ryan, "POOP");
        ahs.addBook(poop, 1);
        
        Author paul = new Author("Dr. Paul Foerster", 100);
        Book calc = new Book(paul, "Calculus: Bad Book");
        ahs.addBook(calc, 2);
        
        System.out.println(ahs);
    }
}
