package airline;

import java.util.List;

public class Dispatcher {
    public void assignMembers(Flight flight, List<Member> member) {
        for (Member m : member) flight.setMember(m);
    }
}
