
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private Author bookAuthor;
    private String title;
    
    public Book (Author at, String tt) {
        this.bookAuthor = at;
        this.title = tt;
    }
    
    public String toString() {
        return "The book is " + this.title + " by " + this.bookAuthor;
    }
}
