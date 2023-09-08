package collections.model;

public class Employee {
    String name;
    String department;
    int salary;

    // WE WILL CREATE PARAMETER CONSTRUCTOR.............


    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // AFTER THAT WE WILL CREATE GETTER AND SETTER ............

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
