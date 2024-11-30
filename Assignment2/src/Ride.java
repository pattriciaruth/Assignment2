import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private String name;
    private String type; // e.g., Roller Coaster, Water Ride
    private boolean isOpen;
    private Employee operator;
    private int maxRiders; // Maximum riders per cycle
    private int numOfCycles; // Number of times the ride has been run
    private Queue<Visitor> waitingLine;
    private LinkedList<Visitor> rideHistory;

    // Constructor
    public Ride(String name, String type, boolean isOpen, Employee operator, int maxRiders) {
        this.name = name;
        this.type = type;
        this.isOpen = isOpen;
        this.operator = operator;
        this.maxRiders = maxRiders;
        this.numOfCycles = 0;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Run one cycle
    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("The ride cannot be run because no operator is assigned.");
            return;
        }

        if (waitingLine.isEmpty()) {
            System.out.println("The ride cannot be run because there are no visitors in the queue.");
            return;
        }

        System.out.println("Running one cycle of the ride...");
        int riders = 0;

        while (!waitingLine.isEmpty() && riders < maxRiders) {
            Visitor visitor = waitingLine.poll(); // Remove visitor from queue
            rideHistory.add(visitor); // Add visitor to ride history
            System.out.println(visitor.getName() + " has taken the ride.");
            riders++;
        }

        numOfCycles++;
        System.out.println("Cycle completed. Total cycles run: " + numOfCycles);
    }

    // Add Visitor to Queue
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        waitingLine.add(visitor);
        System.out.println(visitor.getName() + " added to the queue.");
    }

    // Remove Visitor from Queue
    @Override
    public void removeVisitorFromQueue() {
        if (!waitingLine.isEmpty()) {
            Visitor removedVisitor = waitingLine.poll();
            System.out.println(removedVisitor.getName() + " removed from the queue.");
        } else {
            System.out.println("The queue is empty.");
        }
    }

    // Print Queue
    @Override
    public void printQueue() {
        System.out.println("Visitors in queue for " + name + ":");
        for (Visitor visitor : waitingLine) {
            System.out.println(visitor.getName());
        }
    }

    // Print Ride History
    @Override
    public void printRideHistory() {
        System.out.println("Visitors who have taken the ride:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName());
        }
    }

    // Additional Methods (Getters and Setters)
    public int getNumOfCycles() {
        return numOfCycles;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIsOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public Queue<Visitor> getWaitingLine() {
        return waitingLine;
    }

    public void setWaitingLine(Queue<Visitor> waitingLine) {
        this.waitingLine = waitingLine;
    }

    public LinkedList<Visitor> getRideHistory() {
        return rideHistory;
    }

    public void setRideHistory(LinkedList<Visitor> rideHistory) {
        this.rideHistory = rideHistory;
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numberOfVisitors() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}

