package strategy2;
/**
 * The subject interface 
 * Different types of subjects that the observers can be concerned with
 */
public interface Subject {
    /**
     * Adds a new observer to the list of observers
     * that are concerned with the specific subjct
     * @param observer the observer being added
     */
    public void registerObserver(Observer observer);
    /**
     * Removes a observer from the list of observers
     * concerned with the specific subject
     * @param observer the observer to be removed 
     */
    public void removeObserver(Observer observer);
    /**
     * Notifies the observers of a new book being added
     * @param book the new book being added
     */
    public void notifyObservers(Book book);
}
