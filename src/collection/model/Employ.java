package collection.model;

public class Employ {

    String Name;

    String WorkPlace;

    int Salary;

    int ID;

    public Employ(String name, String workPlace, int salary, int ID) {
        Name = name;
        WorkPlace = workPlace;
        Salary = salary;
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getWorkPlace() {
        return WorkPlace;
    }

    public void setWorkPlace(String workPlace) {
        WorkPlace = workPlace;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
