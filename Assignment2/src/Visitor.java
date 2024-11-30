

public class Visitor extends Person {
    private String ticketType; // e.g., Regular, VIP, Annual Pass
    private boolean hasAccessToAllRides;

    // Default Constructor
    public Visitor() {
        super(); // Call the Person default constructor
        
    }

    // Parameterized Constructor
    public Visitor(String Name, int Age, String Address, String ticketType, boolean hasAccessToAllRides) {
        super(Name, Age, Address); // Call the Person parameterized constructor
        this.ticketType = ticketType;
        this.hasAccessToAllRides = hasAccessToAllRides;
    }

    // Override toString() to provide meaningful output
    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", Address: " + getAddress() + 
               ", Type: " + ticketType + ", Has Paid: " + hasAccessToAllRides;
    }


    // Getters and Setters
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public boolean isHasAccessToAllRides() {
        return hasAccessToAllRides;
    }

    public void setHasAccessToAllRides(boolean hasAccessToAllRides) {
        this.hasAccessToAllRides = hasAccessToAllRides;
    }
}
