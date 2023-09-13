package collection.model;

public class Student {

    public String name;

    public int roll_no;

    public int mark;

    public String branch;


    public Student(String name, int roll_no, int mark, String branch) {
        this.name = name;
        this.roll_no = roll_no;
        this.mark = mark;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
