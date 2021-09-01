package strategy2;
/**
 * This is the class for the Book type
 */
public class Book {
    private String title; // Title of the book
    private String authorFirstName; // First name of the author of the book
    private String authorLastName; // Last name of the author of the book
    /**
     * This is the constructor for the Book class
     * @param title The title of the book
     * @param authorFirstName The first name of the author
     * @param authorLastName The last name of the author
     */
    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    /**
     * A get method for the title
     * @return a String that is the title attribute for this class
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * A get method for the author's first name
     * @return a String that is the authorFirstName attribute of this class
     */
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }
    /**
     * A get method for the author's last name
     * @return a String that is the authorLastName attribute of this class
     */
    public String getAuthorLastName() {
        return this.authorLastName;
    }
    /**
     * This combines all the attributes into one String in the format 
     * specified by the assignment 
     * @return a String that shows the book's title with the author's full name
     */
    public String toString() {
        return this.title + " by: " + this.authorFirstName + " " 
        + this.authorLastName; 
    }
}
