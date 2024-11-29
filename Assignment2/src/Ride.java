
public class Ride {
    private String name;
    private String type; // e.g., Roller Coaster, Water Ride
    private boolean isOpen;
    private Employee operator;

    // Default Constructor
    public Ride() {
        
    }

    // Parameterized Constructor
    public Ride(String name, String type, boolean isOpen, Employee operator) {
        this.name = name;
        this.type = type;
        this.isOpen = isOpen;
        this.operator = operator;
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


    

public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue();
    void printQueue();
    void runOneCycle();
    void addVisitorToHistory(Visitor visitor);
    boolean checkVisitorFromHistory(Visitor visitor);
    int numberOfVisitors();
    void printRideHistory();
}

}

