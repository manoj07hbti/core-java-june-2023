package collection.model;


import java.util.Objects;

public class Employees {

    public String EmpName;
    public double EmpSalary;
    public String EmpCity;
    public String EmpDept;

    public Employees(String empName, double empSalary, String empCity, String empDept) {
        EmpName = empName;
        EmpSalary = empSalary;
        EmpCity = empCity;
        EmpDept = empDept;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return Double.compare(employees.EmpSalary, EmpSalary) == 0 && Objects.equals(EmpName, employees.EmpName) && Objects.equals(EmpCity, employees.EmpCity) && Objects.equals(EmpDept, employees.EmpDept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EmpName, EmpSalary, EmpCity, EmpDept);
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public double getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(double empSalary) {
        EmpSalary = empSalary;
    }

    public String getEmpCity() {
        return EmpCity;
    }

    public void setEmpCity(String empCity) {
        EmpCity = empCity;
    }

    public String getEmpDept() {
        return EmpDept;
    }

    public void setEmpDept(String empDept) {
        EmpDept = empDept;
    }


}

