package edu.ticket;
public class EmailTicketFactory extends TicketFactory {
    
    @Override
    protected Ticket buildTicket(int id, String channel, String type) {
        Ticket ticket = new Ticket(id, channel, type);
        if (type.equalsIgnoreCase("BUG")) {
             ticket.setStrategy(new BugHandlingStrategy());
        } else {
            ticket.setStrategy(new GeneralHandlingStrategy());
        }
        return ticket;
    }

    public EmailTicketFactory() {
        System.out.println("Received from email");
    }

}
