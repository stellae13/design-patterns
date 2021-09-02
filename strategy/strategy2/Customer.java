package strategy2;

import java.util.ArrayList;
/**
 * A Customer is a type of observer that is concerned with all books
 * that have ever been labeled a best seller
 * @author Stella Garcia 
 */
public class Customer implements Observer {
    private Subject subject; // what subject does this observer care about
    private String firstName; // the customer's first name
    private String lastName; // the customer's last name
    private ArrayList<Book> wishList; // the customer's wish list which contains every best seller
    /**
     * This is the constructor for a Customer 
     * @param subject The subject in which the Customer wants to observe
     * @param firstName The first name of the Customer
     * @param lastName The last name of the Customer 
     */
    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.subject.registerObserver(this); // we have to register that customer as an observer in order for them to be notified of new books
        this.firstName = firstName;
        this.lastName = lastName;
        wishList = new ArrayList<Book>(); // Initializes the Customer's wish list 

    }

    /**
     * The update methods adds a new book to the wishList ArrayList
     * @param book The book being added to the wishList
     */
    @Override
    public void update(Book book) {
        this.wishList.add(book);     
    }

     /**
     * The display methods prints the Customer's entire wishList in the 
     * format specified in the assignment. 
     */
    @Override
    public void display() {
        System.out.println("Wish List: ");
        for(Book book: wishList)
            System.out.println("- " + book.toString());
        System.out.println();
    }
    
}
