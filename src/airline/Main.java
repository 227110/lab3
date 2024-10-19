package airline;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Dispatcher dispatcher = new Dispatcher();
        Flight flight1 = new Flight(1, "BebraCo", "Kyiv", "Warsaw", "10:20", "11:00", "international");
        admin.addFlight(flight1);

        Flight flight2 = new Flight(2, "BebraCo", "Kyiv", "Warsaw", "10:20", "11:00", "international");
        admin.addFlight(flight2);

        List<Member> members1 = new ArrayList<>();
        members1.add(new Member(1, "Bob", "Pilot"));
        members1.add(new Member(2, "Jack", "Co-pilot"));
        members1.add(new Member(3, "Sara", "Stewardess"));

        List<Member> members2 = new ArrayList<>();
        members2.add(new Member(1, "Bob2", "Pilot"));
        members2.add(new Member(2, "Jack2", "Co-pilot"));
        members2.add(new Member(3, "Sara2", "Stewardess"));

        dispatcher.assignMembers(flight1, members1);

        dispatcher.assignMembers(flight2, members2);

        admin.displayFlights();

        System.out.println();

        admin.removeFlight(1);

        admin.displayFlights();
    }
}
