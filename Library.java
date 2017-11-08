
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private String name;
    private Book[] books;
    private int index = 0;
    
    public Library(String nm, int number) {
        this.name = nm;
        this.books = new Book[number];
    }
    
    public String toString() {
        String output = "The " + this.name + " library has: \n";
        for (Book b : books) {
            output += b + "\n" ;
        }
        return output;
    }
    
    public void addBook(Book b, int i) {
        books[i] = b;
    }
}
