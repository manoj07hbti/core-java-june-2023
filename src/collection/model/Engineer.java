package collection.model;

import java.util.Objects;

public class Engineer {

    String name;
    String dept;

    int age;
    double sal;

    public Engineer(String name, String dept, int age, double sal) {
        this.name = name;
        this.dept = dept;
        this.age = age;
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return age == engineer.age && Double.compare(engineer.sal, sal) == 0 && Objects.equals(name, engineer.name) && Objects.equals(dept, engineer.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dept, age, sal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
