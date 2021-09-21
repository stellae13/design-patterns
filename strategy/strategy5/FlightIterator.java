package strategy5;

/**
 * FlightIterator class which implements
 *  java.util.Iterator of the Flight type
 */
public class FlightIterator implements java.util.Iterator<Flight> {
    private Flight[] flights; // the flights to iterator through
    private int position; // what flight we are currently on
     /**
      * Constructor method for FlightIterator
      * @param flights the array of Flight to be iterated through
      */
    public FlightIterator(Flight[] flights) {
        this.flights = flights; 
        position = -1; // has to start before the array (has not been iterater through yet)
    }

    /**
     * takes the current position and sees if it has a 
     * Flight after it in the array
     * @return boolean True if its not the last one in the array, False if it is
     */
    @Override
    public boolean hasNext() {
        return flights[position + 1] != null;
    }

    /**
     * next method to iterate through the array
     * @return Flight the next Flight in the array
     */
    @Override
    public Flight next() {
        if(hasNext()) { // if it has a next element
            this.position++; // must move up a position
            return flights[position];
        } else {
            return null; // if there is no next element
        }
    }
    
}
