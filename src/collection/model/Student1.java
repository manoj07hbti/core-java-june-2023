package collection.model;

import java.util.Objects;

public class Student1 {

    public String name;
    int age;
    String section;
    int roll_no;

    public Student1(String name, int age, String section, int roll_no) {
        this.name = name;
        this.age = age;
        this.section = section;
        this.roll_no = roll_no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return roll_no == student1.roll_no;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll_no);
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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}

