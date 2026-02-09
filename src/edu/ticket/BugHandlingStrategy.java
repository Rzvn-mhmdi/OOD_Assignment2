package edu.ticket;
public class BugHandlingStrategy implements HandlingStrategy {
    @Override
    public void assign() { System.out.println("Assigned to engineering"); }
    @Override
    public void respond() { System.out.println("Sending bug response"); }
}
