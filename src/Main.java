import edu.ticket.Ticket;
import edu.ticket.TicketService;
import edu.ticket.TicketFactory;
public class Main {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService();
        TicketFactory factory = new TicketFactory();
        Ticket ticket = factory.createTicket(1, "WEB", "BUG");
        ticket.setRequest("I see a very very BAD BUG!");
        ticketService.handle(ticket);
    }
}
