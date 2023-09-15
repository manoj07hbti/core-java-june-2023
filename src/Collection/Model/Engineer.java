package Collection.Model;

import java.util.Objects;

public class Engineer {
    String EngineerName;
    String EngineerID;
    String EngineerDept;
    double EngineerSalary;

    public Engineer(String engineerName, String engineerID, String engineerDept, double engineerSalary) {
        EngineerName = engineerName;
        EngineerID = engineerID;
        EngineerDept = engineerDept;
        EngineerSalary = engineerSalary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return Objects.equals(EngineerID, engineer.EngineerID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EngineerID);
    }

    public String getEngineerName() {
        return EngineerName;
    }

    public void setEngineerName(String engineerName) {
        EngineerName = engineerName;
    }

    public String getEngineerID() {
        return EngineerID;
    }

    public void setEngineerID(String engineerID) {
        EngineerID = engineerID;
    }

    public String getEngineerDept() {
        return EngineerDept;
    }

    public void setEngineerDept(String engineerDept) {
        EngineerDept = engineerDept;
    }

    public double getEngineerSalary() {
        return EngineerSalary;
    }

    public void setEngineerSalary(double engineerSalary) {
        EngineerSalary = engineerSalary;
    }
}
