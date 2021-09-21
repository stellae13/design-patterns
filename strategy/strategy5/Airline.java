package strategy5;

public class Airline {
    private String title;
    private Flight[] flights;
    private int size;

    public Airline(String title) {
        this.title = title;
        flights = new Flight[2];
        this.size = 2;
    }

    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        Flight add = new Flight(flightNum, from, to, duration, transfers);
        if(flights[size-1] != null)
            flights = this.growArray(flights);
        for(int i = 0; i < this.size; i++) {
            if(flights[i] == null) {
                flights[i] = add;
                break;
            }
        }
    }

    public String getTitle() {
        return this.title;
    }

    private Flight[] growArray(Flight[] flights) {
        Flight[] temp = new Flight[this.size];
        for(int i = 0; i < this.size; ++i) {
            temp[i] = this.flights[i];
        }
        this.flights = new Flight[this.size*2];
        this.size*=2;
        for(int i = 0; i < temp.length; ++i) {
            this.flights[i] = temp[i];
        }
        return this.flights;
    }

    public FlightIterator createIterator() {
        return new FlightIterator(flights);
    } 

}
