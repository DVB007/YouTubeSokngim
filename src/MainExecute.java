public class MainExecute {
    public static void main(String[] args) {
        //Create obj Employee
        Employee emp = new Employee(1,"David","Som", 200);

        System.out.println();
        System.out.println(emp.toString());
        System.out.println("ID : "+ emp.getId());
        System.out.println("LastName : "+ emp.getLastname());
        System.out.println("FirstName : "+ emp.getFirstname());
        System.out.println("Salary : "+ emp.getSalary());
        System.out.println("Annual Salary : "+ emp.getAnnualSalary());
        System.out.println("Raise Salary : "+ emp.raiseSalary(10));

        System.out.println("=======================");

        Employee emp2 = new Employee(2,"Alice","lander", 400);

        System.out.println();
        System.out.println(emp2.toString());
        System.out.println("ID : "+ emp2.getId());
        System.out.println("LastName : "+ emp2.getLastname());
        System.out.println("FirstName : "+ emp2.getFirstname());
        System.out.println("Salary : "+ emp2.getSalary());
        System.out.println("Annual Salary : "+ emp2.getAnnualSalary());
        System.out.println("Raise Salary : "+ emp2.raiseSalary(20));
    }
}
