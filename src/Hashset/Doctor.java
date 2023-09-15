package Hashset;

import java.util.Objects;

public class Doctor {

    String name;

    String address;

    String city;

    double salary;

    public Doctor(String name, String address, String city, double salary) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Double.compare(doctor.salary, salary) == 0 && Objects.equals(name, doctor.name) && Objects.equals(address, doctor.address) && Objects.equals(city, doctor.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, city, salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

