package collection.model;

import java.util.Objects;

public class Engineer {
    String name;
    int id;
    String dpt;
    double salary;

    public Engineer(String name, int id, String dpt, double salary) {
        this.name = name;
        this.id = id;
        this.dpt = dpt;
        this.salary = salary;
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return id == engineer.id && Double.compare(engineer.salary, salary) == 0 && Objects.equals(name, engineer.name) && Objects.equals(dpt, engineer.dpt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, dpt, salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
