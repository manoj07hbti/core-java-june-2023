package collection.model;

public class Doctor {


    public String Name;
    String Degree;

    String Department;

    int salary;

    public Doctor(String name, String degree, String department, int salary) {
        Name = name;
        Degree = degree;
        Department = department;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}










