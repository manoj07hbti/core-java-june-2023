package collection.model;

public class Employee {

    public String EmpName;
    int Age;
    int EmpId;
    String Dept;
    int Salary;

    public Employee(String empName, int age, int empId, String dept, int salary) {
        EmpName = empName;
        Age = age;
        EmpId = empId;
        Dept = dept;
        Salary = salary;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
