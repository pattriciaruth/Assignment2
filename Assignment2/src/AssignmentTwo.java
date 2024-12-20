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

        //Part 6 – Writing to a file
        partSix();

        //Part 7 – Reading from a file
        partSeven();
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
            
        
            public static void partSix() {
                // Create a new Ride
                Employee operator = new Employee("Jane Doe", 28, "789 Elm Street", "Ride Operator", 45000.0);
                Ride ride = new Ride("Cyclone", "Roller Coaster", true, operator, 4);
            
                // Add a minimum of 5 Visitors to the Ride (LinkedList - Ride History)
                ride.addVisitorToHistory(new Visitor("Alice Smith", 25, "123 Park Avenue", "VIP", true));
                ride.addVisitorToHistory(new Visitor("Bob Johnson", 30, "456 Maple Drive", "Regular", false));
                ride.addVisitorToHistory(new Visitor("Charlie Brown", 35, "789 Elm Street", "Regular", true));
                ride.addVisitorToHistory(new Visitor("Daisy Miller", 22, "101 Oak Lane", "VIP", true));
                ride.addVisitorToHistory(new Visitor("Ethan White", 40, "202 Pine Road", "Regular", false));
            
                ride.runOneCycle();
                ride.exportRideHistory("ride_history.txt");
                
                // Export the ride history to a file
                String fileName = "ride_history.txt";
        
                ride.exportRideHistory(fileName);
        
        
                System.out.println("Exporting ride history to " + fileName);
        
            }
            
        
        public static void partSeven() {
        // Code for Part Seven
        // Create a new Ride
        Employee operator = new Employee("Sarah Lee", 35, "456 Oak Lane", "Ride Supervisor", 52000.0);
        Ride ride = new Ride("Thunderbolt", "Water Slide", false, operator, 5);

        ride.addVisitorToHistory(new Visitor("Emily Davis", 15, "123 Forest Road", "Regular", true));
        ride.addVisitorToHistory(new Visitor("Michael Brown", 40, "456 Pine Street", "VIP", false));
    
    
        // Import the file created in the previous part
    String fileName = "ride_history.txt";
    ride.importRideHistory(fileName);

    // Print the number of Visitors in the LinkedList
    System.out.println("Number of Visitors in ride history: " + ride.getRideHistory().size());

    // Print all Visitors in the LinkedList
    System.out.println("Visitors imported into the ride history:");
    for (Visitor visitor : ride.getRideHistory()) {
        System.out.println(visitor);
    }
    }
}

