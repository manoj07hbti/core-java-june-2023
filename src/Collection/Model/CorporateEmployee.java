package Collection.Model;

import java.util.Objects;

public class CorporateEmployee {
    String employeeName;
    String employeeID;
    double employeeSalary;

    public CorporateEmployee(String employeeName, String employeeID, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CorporateEmployee that = (CorporateEmployee) o;
        return Double.compare(that.employeeSalary, employeeSalary) == 0 && Objects.equals(employeeName, that.employeeName) && Objects.equals(employeeID, that.employeeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, employeeID, employeeSalary);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
