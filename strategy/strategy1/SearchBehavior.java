package strategy1;
import java.util.ArrayList;
/**
 * The interface for types of Search Behavoirs
 * @author Stella Garcia
 */
public interface SearchBehavior {
    /**
     * When this class is implemented, this method will search an ArrayList for a item
     * @param data ArrayList<String>, the list of String needing to be searched 
     * @param item String, the item that is being searched for 
     * @return boolean, that returns true if the ArrayList contains the item and false otherwise 
     */
    public abstract boolean contains(ArrayList<String> data, String item);
}
