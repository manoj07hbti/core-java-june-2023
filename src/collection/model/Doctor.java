package collection.model;

public class Doctor {

    String name;
    int age;
    String Dpt;

    public Doctor(String name, int age, String dpt) {
        this.name = name;
        this.age = age;
        this.Dpt = dpt;
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

    public String getDpt() {
        return Dpt;
    }

    public void setDpt(String dpt) {
        this.Dpt = dpt;
    }
}
