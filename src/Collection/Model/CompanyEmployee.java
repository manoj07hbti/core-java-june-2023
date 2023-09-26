package Collection.Model;

import java.util.Objects;

public class CompanyEmployee {
    String Name;
    String ID;
    double Salary;

    public CompanyEmployee(String name, String ID, double salary) {
        Name = name;
        this.ID = ID;
        Salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyEmployee that = (CompanyEmployee) o;
        return Double.compare(that.Salary, Salary) == 0 && Objects.equals(Name, that.Name) && Objects.equals(ID, that.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, ID, Salary);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
