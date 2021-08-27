package strategy1;
import java.util.ArrayList;

/**
 * A type of SearchBehavior called Linear Search
 * @author Stella Garcia
 */
public class LinearSearch implements SearchBehavior {

    @Override
    /**
     * This method searched the Array using a linear method of searching
     * @param data ArrayList<String>, the list of String needing to be searched 
     * @param item String, the item that is being searched for 
     * @return boolean, that returns true if the ArrayList contains the item and false otherwise 
     */
    public boolean contains(ArrayList<String> data, String item) {
        boolean found = false;
        for(String index : data){
            if (item.toLowerCase().equals(index.toLowerCase())){
                found = true;
                break;
            }
        }
        return found;
    }
    
}
