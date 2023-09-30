package Collection.Model;

import java.util.Objects;

public class Companies {
    String CompanyName;
    String EmployeeName;
    String EmployeeID;
    double EmployeeSalary;

    public Companies(String companyName, String employeeName, String employeeID, double employeeSalary) {
        CompanyName = companyName;
        EmployeeName = employeeName;
        EmployeeID = employeeID;
        EmployeeSalary = employeeSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Companies companies = (Companies) o;
        return Double.compare(companies.EmployeeSalary, EmployeeSalary) == 0 && Objects.equals(CompanyName, companies.CompanyName) && Objects.equals(EmployeeName, companies.EmployeeName) && Objects.equals(EmployeeID, companies.EmployeeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CompanyName, EmployeeName, EmployeeID, EmployeeSalary);
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public double getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        EmployeeSalary = employeeSalary;
    }
}
