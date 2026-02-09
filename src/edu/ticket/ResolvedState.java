package edu.ticket;

public class ResolvedState implements TicketState {
    @Override
    public void handle(Ticket ticket) {
    System.out.println("Ticket resolved");
    ticket.setState(new ClosedState());
    }
}
