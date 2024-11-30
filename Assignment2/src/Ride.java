import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private String name; // Name of the ride
    private String type; // Type of ride (e.g., Roller Coaster, Water Ride)
    private boolean isOpen; // Whether the ride is currently open
    private Employee operator; // The employee operating the ride

    private int maxRiders; // Maximum riders per cycle
    private Queue<Visitor> waitingLine; // Queue of visitors waiting for the ride
    private LinkedList<Visitor> rideHistory; // History of visitors who took the ride

    // Default Constructor
    public Ride() {
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Parameterized Constructor
    public Ride(String name, String type, boolean isOpen, Employee operator, int maxRiders) {
        this.name = name;
        this.type = type;
        this.isOpen = isOpen;
        this.operator = operator;
        this.maxRiders = maxRiders;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Getters and Setters
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

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    // Add Visitor to Queue
    
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        waitingLine.add(visitor);
    }

    // Remove Visitor from Queue
    
    @Override
    public void removeVisitorFromQueue() {
        if (!waitingLine.isEmpty()) {
            waitingLine.poll();
        }
    }

    // Run One Cycle
    
    @Override
    public void runOneCycle() {
        if (!isOpen) {
            System.out.println("The ride " + name + " is currently closed.");
            return;
        }

        System.out.println("Running one cycle for " + name + "...");
        int riders = 0;

        // Add visitors from the queue to the ride history, up to maxRiders
        while (!waitingLine.isEmpty() && riders < maxRiders) {
            Visitor visitor = waitingLine.poll();
            rideHistory.add(visitor);
            System.out.println(visitor.getName() + " is riding the " + name + ".");
            riders++;
        }
    }

    // Add Visitor to Ride History
    
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
    }

    // Check if a Visitor is in the Ride History
   
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    // Number of Visitors in Ride History
    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    // Print Ride History
    @Override
    public void printRideHistory() {
        System.out.println("Ride history for " + name + ": ");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName());
        }
    }

    // Print Visitors in the Queue
    @Override
    public void printQueue() {
        System.out.println("Queue for " + name + ": ");
        for (Visitor visitor : waitingLine) {
            System.out.println(visitor.getName());
        }
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
}
