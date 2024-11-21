public class Visitor extends Person{
    private String TicketType; 
    //eg. regular, vip, kids, annual pass
    private boolean HasAccessToAllRides;


    //default constructor
    public Visitor(){
        super();
    }

    //Parameterized constructor
    public Visitor(String Name, int Age, String Address, String TicketType, boolean HasAccessToAllRides){
        
    }
}
