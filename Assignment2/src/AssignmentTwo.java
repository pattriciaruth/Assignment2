public class AssignmentTwo {
    public static void main(String[] args) {
        // Part Three - Create and display objects
        partThree();
    }

    public static void partThree() {
        // Create an Employee
        Employee operator = new Employee("John Doe", 30, "123 Park Street", "Ride Operator", 50000.0);

        // Create a Ride
        Ride rollerCoaster = new Ride("Thunderbolt", "Roller Coaster", true, operator);

        // Create a Visitor
        Visitor visitor = new Visitor("Alice Smith", 25, "456 Main Street", "VIP", true);

        // Display the objects
        System.out.println("Ride: " + rollerCoaster.getName() + " (" + rollerCoaster.getType() + ")");
        System.out.println("Operator: " + rollerCoaster.getOperator().getName());
        System.out.println("Visitor: " + visitor.getName() + " (Ticket Type: " + visitor.getTicketType() + ")");
    }

    public void partFourA() {
        // Code for Part Four A
    }

    public void partFourB() {
        // Code for Part Four B
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

