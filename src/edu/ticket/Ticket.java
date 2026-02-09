package edu.ticket;

public class Ticket {
    private int id;
    private TicketState state;
    private HandlingStrategy strategy;
    private String channel;
    private String type;
    private String request;

    public Ticket(int id, String channel, String type) {
        this.id = id;
        this.channel = channel;
        this.type = type;
        this.state = new NewState();
    }

    public void applyProcess() {
        state.handle(this);
    }

    public void setState(TicketState state) { this.state = state; }
    public TicketState getState() { return state; }
    public void setStrategy(HandlingStrategy strategy) { this.strategy = strategy; }
    public HandlingStrategy getStrategy() { return strategy; }
    public String getChannel() { return channel; }
    public int getId() { return id; }
    public void setRequest(String request) { this.request = request; }
}
