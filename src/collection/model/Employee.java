package collection.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Age == employee.Age && EmpId == employee.EmpId && Salary == employee.Salary && Objects.equals(EmpName, employee.EmpName) && Objects.equals(Dept, employee.Dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EmpName, Age, EmpId, Dept, Salary);
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