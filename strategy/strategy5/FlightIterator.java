package strategy5;

public class FlightIterator implements java.util.Iterator<Flight> {
    private Flight[] flights;
    private int position;

    public FlightIterator(Flight[] flights) {
        this.flights = flights;
        position = -1;
    }

    @Override
    public boolean hasNext() {
        return flights[position + 1] != null;
    }

    @Override
    public Flight next() {
        if(hasNext()) {
            this.position++;
            return flights[position];
        } else {
            return null;
        }
    }
    
}
