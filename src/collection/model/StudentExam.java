package collection.model;

public class StudentExam {

    public static Object brnchName;
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
}
