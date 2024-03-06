package collections.model;

import java.util.Objects;

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

    // HASHCODE AND EQUALS..*******************************************************


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return age == doctor.age && Objects.equals(name, doctor.name) && Objects.equals(specialist, doctor.specialist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, specialist, age);
    }

    //**********************************************************

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
