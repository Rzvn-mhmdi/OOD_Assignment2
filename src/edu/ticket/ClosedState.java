package edu.ticket;

public class ClosedState implements TicketState {
    @Override
    public void handle(Ticket ticket) {

     System.out.println("Ticket closed");
        
        System.out.println("Logging ticket handling :" + ticket.getId() +" -> "+ "Closed");
    }
}
