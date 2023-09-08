package collection.model;

public class Doctor {

    public String name;

    public int Age;

    public String Specialist;

    public int Fees;

    public String Address;


    public Doctor(String name, int age, String specialist, int fees, String address) {
        this.name = name;
        Age = age;
        Specialist = specialist;
        Fees = fees;
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSpecialist() {
        return Specialist;
    }

    public void setSpecialist(String specialist) {
        Specialist = specialist;
    }

    public int getFees() {
        return Fees;
    }

    public void setFees(int fees) {
        Fees = fees;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
