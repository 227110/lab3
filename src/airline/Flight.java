package airline;

import java.util.List;
import java.util.ArrayList;

public class Flight {
    private long id;
    private String company;
    private String departure;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String flightType;

    private List<Member> members;

    public List<Member> getMember() {
        return members;
    }

    public void setMember(Member member) {
        members.add(member);
    }


    public Flight(long id, String company, String departure, String destination, String departureTime, String arrivalTime, String flightType) {
        this.id = id;
        this.company = company;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightType = flightType;
        this.members = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    @Override
    public String toString() {
        return "Flight " + id + " to " + destination + " at " + departureTime + ". Company: " + company + ", type: " + flightType + ", Crew members: " + members.toString();
    }
}
