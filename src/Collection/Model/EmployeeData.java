package Collection.Model;

import java.util.Objects;

public class EmployeeData {
    String EmployeeName;
    double EmployeeSalary;
    String EmployeeCity;
    String EmployeeDept;

    public EmployeeData(String employeeName, double employeeSalary, String employeeCity, String employeeDept) {
        EmployeeName = employeeName;
        EmployeeSalary = employeeSalary;
        EmployeeCity = employeeCity;
        EmployeeDept = employeeDept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeData that = (EmployeeData) o;
        return Double.compare(that.EmployeeSalary, EmployeeSalary) == 0 && Objects.equals(EmployeeName, that.EmployeeName) && Objects.equals(EmployeeCity, that.EmployeeCity) && Objects.equals(EmployeeDept, that.EmployeeDept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EmployeeName, EmployeeSalary, EmployeeCity, EmployeeDept);
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        EmployeeSalary = employeeSalary;
    }

    public String getEmployeeCity() {
        return EmployeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        EmployeeCity = employeeCity;
    }

    public String getEmployeeDept() {
        return EmployeeDept;
    }

    public void setEmployeeDept(String employeeDept) {
        EmployeeDept = employeeDept;
    }
}
