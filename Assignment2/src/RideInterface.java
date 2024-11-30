
public interface RideInterface {
    // Add a visitor to the queue
    void addVisitorToQueue(Visitor visitor);

    // Remove a visitor from the queue
    void removeVisitorFromQueue();

    // Print all visitors currently in the queue
    void printQueue();

    // Run one cycle of the ride (process visitors from the queue)
    void runOneCycle();

    // Add a visitor to the ride history
    void addVisitorToHistory(Visitor visitor);

    // Check if a specific visitor is in the ride history
    boolean checkVisitorFromHistory(Visitor visitor);

    // Get the total number of visitors in the ride history
    int numberOfVisitors();

    // Print all visitors in the ride history
    void printRideHistory();
}
