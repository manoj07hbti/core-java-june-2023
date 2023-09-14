package collection.model;

import java.util.Objects;

public class Engineer {

     public String EngName;
     String EngID;
     double Salary;

    public Engineer(String engName, String engID, double salary) {
        EngName = engName;
        EngID = engID;
        Salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return Double.compare(engineer.Salary, Salary) == 0 && Objects.equals(EngName, engineer.EngName) && Objects.equals(EngID, engineer.EngID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EngName, EngID, Salary);
    }

    public String getEngName() {
        return EngName;
    }

    public void setEngName(String engName) {
        EngName = engName;
    }

    public String getEngID() {
        return EngID;
    }

    public void setEngID(String engID) {
        EngID = engID;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
