package strategy2;
/**
 * The observer interface
 * Different types of Observers will impliment this interface
 */
public interface Observer {
    /**
     * This method will be implemeted by all the types of Observer
     * It will do different things depending on the type of Observer
     * @param book the book that is being updated 
     */
    public void update(Book book);
    /**
     * Each type of Observer will need to implement this method to
     * specify how it will be displayed
     */
    public void display();
}
