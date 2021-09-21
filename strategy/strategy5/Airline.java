package strategy5;
/**
 * The Airline class
 * Has a name of Airline along with 
 * the flights of the day in an array
 * @author Stella Garcia
 */
public class Airline {
    private String title;
    private Flight[] flights;
    private int size; // current size of flights array

    /**
     * Constructor for Airline class
     * @param title the title/name of the airline
     * initiliazes the flights array at size 2
     * in accordance with the instructions
     */
    public Airline(String title) {
        this.title = title;
        flights = new Flight[2];
        this.size = 2; 
    }

    /**
     * This methods adds a flight to this Airline's flights array
     * @param flightNum The flight number of the flight to be added
     * @param from Where the flight is taking off from
     * @param to Where the flight is flying to 
     * @param duration How long the flight is
     * @param transfers How many transfers/layovers their are (0 = direct flight)
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        Flight add = new Flight(flightNum, from, to, duration, transfers); // creating the new flight
        if(flights[size-1] != null) // if the array is full
            flights = this.growArray(flights); // we have to grow the array
        for(int i = 0; i < this.size; i++) { // this will add the flight to the first null spot in the array
            if(flights[i] == null) {
                flights[i] = add;
                break;
            }
        }
    }
    /**
     * Get method for the title/name of the Airline
     * @return String the title of the Airline
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * Private helper method that grows the array 
     * by a factor of 2 (doubles the size)
     * @param flights the array we want to grow 
     * @return the newly grown array
     */
    private Flight[] growArray(Flight[] flights) {
        Flight[] temp = new Flight[this.size*2]; // makes the new array double the size of the older array
        for(int i = 0; i < this.size; ++i) // transfers all of the contents of the old array to the new array
            temp[i] = this.flights[i];
        this.size*=2; // updates the size
        return temp; // returns the new, bigger array
    }

    /**
     * Creates an iterator to run through the
     * Airline's flights array
     * @return a new FlightIterator
     */
    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    } 

}
