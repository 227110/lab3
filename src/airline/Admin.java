package airline;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Flight> flights;

    public Admin() {
        flights = new ArrayList<Flight>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void removeFlight(long flightId) {
        flights.removeIf(flight -> flight.getId() == flightId);
    }

    public void displayFlights() {
        if (flights.isEmpty()) {
            System.out.println("No flights available.");
        } else {
            flights.forEach(System.out::println);
        }
    }
}
