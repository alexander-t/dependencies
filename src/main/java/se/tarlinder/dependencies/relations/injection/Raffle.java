package se.tarlinder.dependencies.relations.injection;

import java.util.Set;

public class Raffle {
    private Set<Integer> tickets;

    public Raffle(Set<Integer> tickets) {
        this.tickets = tickets;
    }

    public int getTicketCount() {
        return tickets.size();
    }

    public void setTickets(Set<Integer> tickets) {
        this.tickets = tickets;
    }
}

