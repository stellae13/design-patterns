package strategy2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * A Store is a type of observer that is concerned with the 
 * top 5 bestSellers 
 */
public class Store implements Observer {
    private Subject subject; // what subject does the observer care about
    private String title; // the title of the Store (unused, but in the UML)
    private Queue<Book> bestSellers; // The queue of the top 5 bestSellers
    /**
     * The construtor method for a Store 
     * @param subject the Subject in which the Store wants to observe
     */
    public Store(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this); // we have to register that customer as an observer in order for them to be notified of new books
        this.bestSellers = new LinkedList<Book>(); // initialies the bestSellers Queue as a LinkedList (Queue is an interface)
    }
    /**
     * This update method add a new book to the bestSellers queue 
     * and removes the oldest one if the queue is larger than 5
     * @param book the new book that is being added to the bestSellers queue
     */
    @Override
    public void update(Book book) {
        this.bestSellers.add(book);

        if(this.bestSellers.size() > 5) 
            this.bestSellers.remove(); // this removes the first element in the queue and moves the remaining data down one index
    }

     /**
     * This display method displays the bestSellers queue
     * in the format specified by the assignment 
     */
    @Override
    public void display() {
        System.out.println("Top 5 Best Sellers: ");
        for(Book book: bestSellers) 
            System.out.println("- " + book.toString());
        System.out.println(); // the sample output had a space at the end of the display foor the store
    }
    
}
