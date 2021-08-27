package strategy1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A type of SearchBehavior called BinarySearch
 * @author Stella Garcia
 */
public class BinarySearch implements SearchBehavior{
    
    @Override
    /**
     * This method searched the Array using a binary method of searching
     * @param data ArrayList<String>, the list of String needing to be searched 
     * @param item String, the item that is being searched for 
     * @return boolean, that returns true if the ArrayList contains the item and false otherwise 
     */
    public boolean contains(ArrayList<String> data, String item) {
        boolean found = false;
        /**
         * Referenced the website Geeks for Geeks on making the Binary Search
         * link: https://www.geeksforgeeks.org/java-program-to-perform-binary-search-on-arraylist/
         */
        Collections.sort(data);
        int leftIndex = 0;
        int rightIndex = data.size();
        while (leftIndex <= rightIndex){
            int middle = leftIndex + (rightIndex - leftIndex)/2;

            if(data.get(middle).toLowerCase().compareTo(item.toLowerCase()) == 0) {
                found = true;
                break;
            }

            if(data.get(middle).toLowerCase().compareTo(item.toLowerCase()) < 0) {
                leftIndex = middle + 1;
            } else {
                rightIndex = middle - 1;
            }
        }
        return found;
    }
    
}
