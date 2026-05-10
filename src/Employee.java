public class Employee {
    //field / variable
    private int id;
    private String lastname;
    private String firstname;
    private int salary;

    //method
    //Constructor
    public Employee(int id, String lastname, String firstname, int salary){
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.salary = salary;
    }

    //Getter
    public int getId (){
        return this.id;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getFirstname (){
        return this.firstname;
    }

    public String getName(){
        return this.lastname + " " + this.firstname;
    }

    public int getSalary(){
        return this.salary;
    }

    public int getAnnualSalary(){
        return salary * 12;
    }

    public int raiseSalary(int percent){
        return (((salary * percent)/100) + salary);
    }

    public String toString (){
        return "Employee [ id = "+this.id + ", name = "+ this.getName() + ", salary = "+this.salary+" ]";
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
