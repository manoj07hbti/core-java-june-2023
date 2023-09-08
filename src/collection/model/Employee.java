package collection.model;

public class Employee {

    public String Name;

    public int Age;

    public String Department;

    public String CompName;

    public Employee(String name, int age, String department, String compName) {
        Name = name;
        Age = age;
        Department = department;
        CompName = compName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getCompName() {
        return CompName;
    }

    public void setCompName(String compName) {
        CompName = compName;
    }
}
