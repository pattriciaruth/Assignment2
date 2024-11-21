
public class Employee extends Person {
    private String Jobtitle;
    private double Salary;


  //default constructor
    public Employee(){
        super();
    }

    public Employee(String Name, int Age, String Address, String Jobtitle, double Salary){
        super(Name, Age, Address );
        this.Jobtitle = Jobtitle;
        this.Salary = Salary;
    }

    // Getters and Setters
    public String getJobtitle() {
        return Jobtitle;
    }

    public void setJobtitle(String Jobtitle ) {
        this.Jobtitle = Jobtitle;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

}
