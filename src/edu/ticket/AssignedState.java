package edu.ticket;

public class AssignedState implements TicketState {
    @Override
    public void handle(Ticket ticket) {
        ticket.getStrategy().assign(); 
        ticket.setState(new InProgressState());
    }
}
