package collection.model;

import java.security.PublicKey;
import java.util.Objects;

public class Company {

    public String EmpName;
    public int EmpID;
    public String Department;
    public double Salary;

    public Company(String empName, int empID, String department, double salary) {
        EmpName = empName;
        EmpID = empID;
        Department = department;
        Salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return EmpID == company.EmpID && Double.compare(company.Salary, Salary) == 0 && Objects.equals(EmpName, company.EmpName) && Objects.equals(Department, company.Department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EmpName, EmpID, Department, Salary);
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
