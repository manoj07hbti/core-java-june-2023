package Parametrized_constructor;

public class Engineer_param {

    String name;

    String profession;

    String company;

    String address;

    int age;

    public Engineer_param(String name, String profeesion, String company, String address, int age) {
        this.name = name;
        this.profession = profeesion;
        this.company = company;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Engineer_param engineer1=new Engineer_param("param","engineer","TCS","Guna",23);

        System.out.println("person1 name is :"+engineer1.name +"profession :"+engineer1.profession+"company:"+engineer1.company+"address:"+engineer1.address+"age:"+engineer1.age);

        System.out.println("Data after using setter method");

        engineer1.setName("Raghav");
        engineer1.setProfession("doctor");
        engineer1.setCompany("infosis");
        engineer1.setAddress("gwalior");
        engineer1.setAge(43);

        System.out.println("engineer1 name is:"+engineer1.name+ "profession:"+engineer1.profession+ "company:"+engineer1.company+ "address:"+engineer1.address+ "age:"+engineer1.age);

    }
}
