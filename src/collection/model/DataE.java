package collection.model;

import java.util.Objects;

public class DataE {

    public String Name;

    public String CompanyName;

    public int Salary;

    public int id;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataE dataE = (DataE) o;
        return Salary == dataE.Salary && id == dataE.id && Objects.equals(Name, dataE.Name) && Objects.equals(CompanyName, dataE.CompanyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, CompanyName, Salary, id);
    }

    public DataE(String name, String companyName, int salary, int id) {
        Name = name;
        CompanyName = companyName;
        Salary = salary;
        this.id = id;


    }
}


