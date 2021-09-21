package strategy5;

/**
 * Flight class
 * Describes one single plane's flight for the day
 * @author Stella Garcia
 */
public class Flight {
    private String flightNum; // flight Number
    private String from; // Where the flight is taking off from
    private String to; // Where the flight is flying to
    private int duration; // how long the flight is in minutes
    private int transfers; // how many transfers/layovers the flight has

    /**
     * Constructor for Flight class
     * @param flightNum the flight number
     * @param from where the flight is taking off from
     * @param to where the flight is going to 
     * @param duration how long the flight is in minutes
     * @param transfers how many transfers/layovers the flight has
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    /**
     * Get method for the from attribute
     * @return String from
     */
    public String getFrom() {
        return this.from;
    }
    /**
     * Get method for the to attribute
     * @return String to
     */
    public String getTo() {
        return this.to;
    }

    /**
     * Get method for the duration attribute
     * @return int duration
     */
    public int getDuration() {
        return this.duration;
    }
    /**
     * Get method for the transfers attribute
     * @return int transfers
     */
    public int getNumTransfers() {
        return this.transfers;
    }
    /**
     * The toString method for a Flight object
     * @return String in the format specified by the 
     * assignmet description 
     */
    @Override
    public String toString() {
        String output = "Flight number: " + this.flightNum + "\n"+
                       "From: " + this.from + "\n" +
                       "To: " + this.to + "\n";
        int hours;
        int minutes;
        hours = duration/60; // solves for the hours
        minutes = duration%60; // the leftover is the minutes 
        output+= "Duration: " + hours + " hours " + minutes + " minutes\n";
        if(transfers == 0)
            output+= "Direct Flight"; // - transfers means its a direct flight
        else if(transfers == 1)
            output+= "1 Transfer"; // 1 transfer is not plural
        else
            output+= transfers + " transfers"; // anything greater than 1 woud be plural 
        return output;
    }
}
