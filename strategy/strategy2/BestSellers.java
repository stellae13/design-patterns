package strategy2;

import java.util.ArrayList;
/**
 * BestSellers is a type of Subject that deals with Books 
 */
public class BestSellers implements Subject {
    private ArrayList<Observer> observers; // These are the poeple/groups who care about the Best Sellers
    private ArrayList<Book> bestSellers; // There are all of the books that have ever been labeled Best Seller
    /**
     * This is the constructor for Best Sellers
     * It initializes the observers and the best sellers ArrayLists
     */
    public BestSellers() {
        this.observers = new ArrayList<Observer>();
        this.bestSellers = new ArrayList<Book>();
    }

    /**
     * This adds a new observer to the observers ArrayList
     */
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * This removes a specified observer from the observers ArrayList
     */
    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * This will notify each observer (no matter they type) of a new book
     * being labeled as a bestSeller
     */
    @Override
    public void notifyObservers(Book book) {
        for(Observer observer: observers) 
            observer.update(book);
    }
    
    /**
     * This adds a book to the bestSellers ArrayList and calls the notifyObservers method
     * to let everyone/everything that is observing the bestSellers list know
     * @param book This is the book that is newly being labeled a bestSeller
     */
    public void addBook(Book book) {
        this.bestSellers.add(book);
        this.notifyObservers(book);
    }
    
}
