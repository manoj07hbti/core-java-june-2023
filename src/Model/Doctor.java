package Model;

public class Doctor {

    public String name;

    public String department;
    public String hospital;

    public int age;

    public Doctor(String name, String department, String hospital, int age) {
        this.name = name;
        this.department = department;
        this.hospital = hospital;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}



