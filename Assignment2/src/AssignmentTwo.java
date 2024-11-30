public class AssignmentTwo {
    public static void main(String[] args) {
        // Part Three - Create and display objects
        partThree();

        // Part Four A - Add visitors to the queue and display the queue
        partFourA();

        // Part Four B - Run a cycle and display the ride history
        partFourB();

        // Part Five - Run a ride cycle
        partFive();
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
        
        
        
            public static void partFive() {
        // Create a Ride with a max capacity of 4 riders per cycle
        Employee operator = new Employee("Jane Doe", 28, "789 Elm Street", "Ride Operator", 45000.0);
        Ride ride = new Ride("Cyclone", "Roller Coaster", true, operator, 4);

        // Add 10 unique visitors to the queue
    ride.addVisitorToQueue(new Visitor("Alice Smith", 25, "123 Park Avenue", "VIP", true));
    ride.addVisitorToQueue(new Visitor("Bob Johnson", 30, "456 Maple Drive", "Regular", false));
    ride.addVisitorToQueue(new Visitor("Charlie Brown", 35, "789 Elm Street", "Regular", true));
    ride.addVisitorToQueue(new Visitor("Daisy Miller", 22, "101 Oak Lane", "VIP", true));
    ride.addVisitorToQueue(new Visitor("Ethan White", 40, "202 Pine Road", "Regular", false));
    ride.addVisitorToQueue(new Visitor("Fiona Green", 27, "303 Cedar Court", "VIP", true));
    ride.addVisitorToQueue(new Visitor("George King", 33, "404 Spruce Street", "Regular", true));
    ride.addVisitorToQueue(new Visitor("Hannah Lee", 19, "505 Birch Boulevard", "Regular", false));
    ride.addVisitorToQueue(new Visitor("Ian Black", 29, "606 Walnut Way", "VIP", true));
    ride.addVisitorToQueue(new Visitor("Jenny Adams", 24, "707 Chestnut Circle", "Regular", false));


        // Print all visitors in the queue
        ride.printQueue();

        // Run one cycle
        ride.runOneCycle();

        // Print all visitors in the queue after one cycle
        ride.printQueue();

        // Print all visitors in the ride history
        ride.printRideHistory();
    }
    

    public void partSix() {
        // Code for Part Six
    }

    public void partSeven() {
        // Code for Part Seven
    }
}

