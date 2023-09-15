package Collection.Model;

import java.util.Objects;

public class Student {
    String StudentName;
    String FatherName;
    int age;
    int RollNumber;



    public Student(String studentName, String fatherName, int age, int rollNumber) {
        StudentName = studentName;
        FatherName = fatherName;
        this.age = age;
        RollNumber = rollNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && RollNumber == student.RollNumber && Objects.equals(StudentName, student.StudentName) && Objects.equals(FatherName, student.FatherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StudentName, FatherName, age, RollNumber);
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNumber() {
        return RollNumber;
    }

    public void setRollNumber(int rollNumber) {
        RollNumber = rollNumber;
    }
}
