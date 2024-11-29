public class Visitor extends Person {
    private String ticketType; // e.g., Regular, VIP, Annual Pass
    private boolean hasAccessToAllRides;

    // Default Constructor
    public Visitor() {
        super(); // Call the Person default constructor
        this.ticketType = "Regular";
        this.hasAccessToAllRides = false;
    }

    // Parameterized Constructor
    public Visitor(String name, int age, String address, String ticketType, boolean hasAccessToAllRides) {
        super(name, age, address); // Call the Person parameterized constructor
        this.ticketType = ticketType;
        this.hasAccessToAllRides = hasAccessToAllRides;
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
