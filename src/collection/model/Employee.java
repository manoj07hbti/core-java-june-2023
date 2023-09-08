package collection.model;

public class Employee {

    String name;
    int age;
    String dpt;
    String add;
    double salary;


    public Employee(String name, int age, String dpt, String add, double salary) {
        this.name = name;
        this.age = age;
        this.dpt = dpt;
        this.add = add;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
