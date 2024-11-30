public class AssignmentTwo {
    public static void main(String[] args) {
        // Part Three - Create and display objects
        partThree();

        // Part Four A - Add visitors to the queue and display the queue
        partFourA();

        // Part Four B - Run a cycle and display the ride history
        partFourB();
    }

    public static void partThree() {
        // Create an Employee
        Employee operator = new Employee("John Doe", 30, "123 Park Street", "Ride Operator", 50000.0);

        // Create a Ride
        Ride rollerCoaster = new Ride("Thunderbolt", "Roller Coaster", true, operator, 0);

        // Create a Visitor
        Visitor visitor = new Visitor("Alice Smith", 25, "456 Main Street", "VIP", true);

        // Display the objects
        System.out.println("Ride: " + rollerCoaster.getName() + " (" + rollerCoaster.getType() + ")");
        System.out.println("Operator: " + rollerCoaster.getOperator().getName());
        System.out.println("Visitor: " + visitor.getName() + " (Ticket Type: " + visitor.getTicketType() + ")");
    }

    public static void partFourA() {
        // Create a Ride
        Ride rollerCoaster = new Ride("Thunderbolt", "Roller Coaster", true, new Employee("John Doe", 30, "123 Park Street", "Ride Operator", 50000.0), 2);

        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(new Visitor("Alice Smith", 25, "456 Main Street", "VIP", true));
        rollerCoaster.addVisitorToQueue(new Visitor("Bob Johnson", 28, "789 Maple Street", "Regular", false));
        rollerCoaster.addVisitorToQueue(new Visitor("Charlie Brown", 32, "101 Oak Avenue", "Regular", false));

        // Print the queue
        System.out.println("Queue for " + rollerCoaster.getName() + ":");
        rollerCoaster.printQueue();
    }

    public static void partFourB() {
        // Create a Ride
        Ride rollerCoaster = new Ride("Thunderbolt", "Roller Coaster", true, new Employee("John Doe", 30, "123 Park Street", "Ride Operator", 50000.0), 2);

        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(new Visitor("Alice Smith", 25, "456 Main Street", "VIP", true));
        rollerCoaster.addVisitorToQueue(new Visitor("Bob Johnson", 28, "789 Maple Street", "Regular", false));
        rollerCoaster.addVisitorToQueue(new Visitor("Charlie Brown", 32, "101 Oak Avenue", "Regular", false));

        // Run one cycle
        System.out.println("\nRunning a cycle for " + rollerCoaster.getName() + "...");
        rollerCoaster.runOneCycle();

        // Print the ride history
        System.out.println("Ride history for " + rollerCoaster.getName() + ":");
        rollerCoaster.printRideHistory();
    }



    public void partFive() {
        // Code for Part Five
    }

    public void partSix() {
        // Code for Part Six
    }

    public void partSeven() {
        // Code for Part Seven
    }
}

