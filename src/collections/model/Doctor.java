package collections.model;

public class Doctor {
    String name;
    String specialist;
    int age;
    // WE WILL CREATE PARAMETER CONSTRUCTOR.............

    public Doctor(String name, String specialist, int age) {
        this.name = name;
        this.specialist = specialist;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
