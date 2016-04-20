package se.tarlinder.dependencies.relations.factory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Raffle {
    private Set<Integer> tickets;

    public Raffle(Set<Integer> tickets) {
        this.tickets = createTickets();
    }

    public int getTicketCount() {
        return tickets.size();
    }

    protected Set<Integer> createTickets() {
        return new HashSet<>(Arrays.asList(9, 1, 4, 7));
    }
}

