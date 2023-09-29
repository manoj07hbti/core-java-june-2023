package Collection.Model;

import java.util.Objects;

public class CompanyData {
    String CompanyName;
    String EmployeeName;
    String EmployeeId;
    double EmployeeSalary;

    public CompanyData(String companyName, String employeeName, String employeeId, double employeeSalary) {
        CompanyName = companyName;
        EmployeeName = employeeName;
        EmployeeId = employeeId;
        EmployeeSalary = employeeSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyData that = (CompanyData) o;
        return Double.compare(that.EmployeeSalary, EmployeeSalary) == 0 && Objects.equals(CompanyName, that.CompanyName) && Objects.equals(EmployeeName, that.EmployeeName) && Objects.equals(EmployeeId, that.EmployeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CompanyName, EmployeeName, EmployeeId, EmployeeSalary);
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

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public double getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        EmployeeSalary = employeeSalary;
    }
}
