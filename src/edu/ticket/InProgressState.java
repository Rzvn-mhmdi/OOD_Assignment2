package edu.ticket;

public class InProgressState implements TicketState {
    @Override
    public void handle(Ticket ticket) {
        System.out.println("Working on ticket");
        ticket.getStrategy().respond();
        ticket.setState(new ResolvedState());
    }
}
