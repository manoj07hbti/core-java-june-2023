package collection.model;

import java.util.Objects;

public class Employee {

    String empId;
    String empName;
    int age;
    double sal;
    String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee(String empId, String empName, int age, double sal, String companyName) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.sal = sal;
        this.companyName = companyName;
    }

    public Employee(String empId, String empName, int age, double sal) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.sal = sal;
    }

    public String getEmpId() {
        return empId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(empId, employee.empId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
