package Hashset;

import java.util.Objects;

public class Student {

    String name;

    int rollNo;

    String branch;

    String city;

    double marks;

    public Student(String name, int rollNo, String branch, String city, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.city = city;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && Double.compare(student.marks, marks) == 0 && Objects.equals(name, student.name) && Objects.equals(branch, student.branch) && Objects.equals(city, student.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, branch, city, marks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
