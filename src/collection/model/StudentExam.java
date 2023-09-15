package collection.model;

import java.util.Objects;

public class StudentExam {
    String Name;

    String BranchName;
    int RollNo;

    int Marks;

    public StudentExam(String name, String branchName, int rollNo, int marks) {
        Name = name;
        BranchName = branchName;
        RollNo = rollNo;
        Marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String branchName) {
        BranchName = branchName;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentExam that = (StudentExam) o;
        return RollNo == that.RollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(RollNo);
    }
}
