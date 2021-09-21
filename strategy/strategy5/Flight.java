package strategy5;

public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom() {
        return this.from;
    }

    public String getTo() {
        return this.to;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getNumTransfers() {
        return this.transfers;
    }

    @Override
    public String toString() {
        String output = "Flight number: " + this.flightNum + "\n"+
                       "From: " + this.from + "\n" +
                       "To: " + this.to + "\n";
        int hours;
        int minutes;
        hours = duration/60;
        minutes = duration%60;
        output+= "Duration: " + hours + " hours " + minutes + " minutes\n";
        if(transfers == 0)
            output+= "Direct Flight";
        else if(transfers == 1)
            output+= "1 Transfer";
        else
            output+= transfers + " transfers";
        return output;
    }
}
