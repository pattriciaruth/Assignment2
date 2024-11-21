public class Person {
    private String Name;
    private int Age;
    private String Address;


    //default Constructor
    public Person() {

    }

    //Parameterizing Constructor
    public Person (String Name, int age, String Address){
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        
    }

    //getters and setters
    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public int getAge(){
        return Age;
    }

    public void setAge(int Age){
        this.Age = Age;
    }

    public String getAddress(){
        return Address;
    }

    public void setAddress(String Address){
        this.Address = Address;
    }

}
