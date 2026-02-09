package edu.ticket;

import edu.ticket.Ticket;

public class TicketFactory {
    public Ticket createTicket(int id, String channel, String type) {
        if (channel.equalsIgnoreCase("WEB")) {
            return new WebTicketFactory().buildTicket(id, channel, type);
        } else {
            return new EmailTicketFactory().buildTicket(id, channel, type);
        }
    }

    protected Ticket buildTicket(int id, String channel, String type) {
        return null;
    }
}


