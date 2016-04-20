package se.tarlinder.dependencies.relations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Raffle {
    private Set<Integer> tickets;

    public int getTicketCount() {
        return tickets.size();
    }

    public Raffle() {
        tickets = new HashSet<>(Arrays.asList(9, 1, 4, 7));
    }
}

