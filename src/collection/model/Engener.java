package collection.model;

import java.util.Objects;

public class Engener {

    String Name;
    String Branch;
    String Compony;
    String ID;
    int Salary;

    public Engener(String name, String branch, String compony, String ID, int salary) {
        Name = name;
        Branch = branch;
        Compony = compony;
        this.ID = ID;
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public String getCompony() {
        return Compony;
    }

    public void setCompony(String compony) {
        Compony = compony;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        collection.model.Engener engener = (collection.model.Engener) o;
        return Salary == engener.Salary && Objects.equals(Name, engener.Name) && Objects.equals(Branch, engener.Branch) && Objects.equals(Compony, engener.Compony) && Objects.equals(ID, engener.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Branch, Compony, ID, Salary);
    }
}






