package collection.model;
import java.util.Objects;
public class Employeees {


    public String empName;
    public String empID;
    public int empAge;
    public String empDept;
    public double empSalary;
    public String empCompany;
    public String empCity;

    public Employeees(String empName, String empID, int empAge, String empDept, double empSalary, String empCompany, String empCity) {
        this.empName = empName;
        this.empID = empID;
        this.empAge = empAge;
        this.empDept = empDept;
        this.empSalary = empSalary;
        this.empCompany = empCompany;
        this.empCity = empCity;
    }

    public Employeees(String empName, String empDept, int empSal, String empCity) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employeees that = (Employeees) o;
        return empAge == that.empAge && Double.compare(that.empSalary, empSalary) == 0 && Objects.equals(empName, that.empName) && Objects.equals(empID, that.empID) && Objects.equals(empDept, that.empDept) && Objects.equals(empCompany, that.empCompany) && Objects.equals(empCity, that.empCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, empID, empAge, empDept, empSalary, empCompany, empCity);
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpCompany() {
        return empCompany;
    }

    public void setEmpCompany(String empCompany) {
        this.empCompany = empCompany;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }
}


