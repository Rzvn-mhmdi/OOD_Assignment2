package edu.ticket;

public class TicketService {
    public void handle(Ticket ticket) {
        while (!(ticket.getState() instanceof ClosedState)) {
            ticket.applyProcess();
        }
        ticket.applyProcess();
    }
}
