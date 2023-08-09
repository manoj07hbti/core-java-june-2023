package Parametrized_constructor;

public class Doctor_class {

    String name;

    String profession;

    String city;

    String hospital;

    int age;

    public Doctor_class(String name, String profession, String city, String hospital, int age) {
        this.name = name;
        this.profession = profession;
        this.city = city;
        this.hospital = hospital;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public static void main(String[] args) {

        Doctor_class doctor1=new Doctor_class("param","Doctor","indore","ssims",34);

        System.out.println("Doctor1 name is:"+doctor1.name+"profession:"+doctor1.profession+"city:"+doctor1.city+"hospital:"+doctor1.hospital+"age:"+doctor1.age);


        Doctor_class doctor2=new Doctor_class("anubhav","Doctor","ashoknagar","link",56);

        System.out.println("doctor2 name is:"+doctor2.name+"profession:"+doctor2.profession+"city:"+doctor2.city+"hospital:"+doctor2.hospital+"age:"+doctor2.age);

        Doctor_class doctor3=new Doctor_class("sachin","Doctor","jabalpur","aims",59);

        System.out.println("doctor3 name is:"+doctor3.name+"profession:"+doctor3.profession+"city:"+doctor3.city+"hospital:"+doctor3.hospital+"age:"+doctor3.age);

        Doctor_class doctor4=new Doctor_class("karan","Doctor","datia","ameri",24);

        System.out.println("doctor4 name is:"+doctor4.name+"profession:"+doctor4.profession+"city:"+doctor4.city+"hospital:"+doctor4.hospital+"age:"+doctor4.age);


        System.out.println("data after using setter method");

        doctor1.setName("rajeev");
        System.out.println("Doctor1 name is:"+doctor1.name+"profession:"+doctor1.profession+"city:"+doctor1.city+"hospital:"+doctor1.hospital+"age:"+doctor1.age);

        doctor2.setProfession("bussinessman");
        System.out.println("doctor2 name is:"+doctor2.name+"profession:"+doctor2.profession+"city:"+doctor2.city+"hospital:"+doctor2.hospital+"age:"+doctor2.age);

        doctor3.setCity("banglore");
        System.out.println("doctor3 name is:"+doctor3.name+"profession:"+doctor3.profession+"city:"+doctor3.city+"hospital:"+doctor3.hospital+"age:"+doctor3.age);

        doctor4.setHospital("mits");
        System.out.println("doctor4 name is:"+doctor4.name+"profession:"+doctor4.profession+"city:"+doctor4.city+"hospital:"+doctor4.hospital+"age:"+doctor4.age);





    }
}
