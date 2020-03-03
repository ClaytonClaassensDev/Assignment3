public class Employee extends Person {

    String employeeID;
    double salary;

    public Employee(){



    }

    public Employee(String name, String surname, String empID, double salary){

        super(name, surname);
        this.employeeID = empID;
        this.salary = salary;
    }


    public void setEmployeeID(String empID){

        String empIDcreate = name+surname;
        empID = empIDcreate;

        this.employeeID = empID;
    }

    public void setSalary(double salary){

        this.salary = salary;
    }

    public String getEmployeeID(){ return employeeID;}

    public double getSalary(){ return salary;}


}
