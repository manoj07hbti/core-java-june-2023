package sept_10_test5.model;

public class Student {
    String name;
    int rollNo;
    double marks;
    String branch;

    public Student(String name, int rollNo, double marks, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.branch = branch;
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

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
