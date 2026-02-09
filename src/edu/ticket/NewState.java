package edu.ticket;

public class NewState implements TicketState {
    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket created");
        ticket.setState(new AssignedState());
    }
}
