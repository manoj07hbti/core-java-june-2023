package Practise_package;

public class Advocatemethod {


    String name;

    String Department;

    String city;

    String expert;

    int age;

    public Advocatemethod(String name, String department, String city, String expert, int age) {
        this.name = name;
        Department = department;
        this.city = city;
        this.expert = expert;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Advocatemethod advocate1=new Advocatemethod("ram","criminal","gwalior","law field",54);

        System.out.println("advocate1 name is:"+advocate1.name+"department:"+advocate1.Department+"city:"+advocate1.city+"expert:"+advocate1.expert+"age:"+advocate1.age);

        Advocatemethod advocate2=new Advocatemethod("ramesh","law","pune","propertydispute",32);

        System.out.println("advocate2 name is:"+advocate2.name+"department:"+advocate2.Department+"city:"+advocate2.city+"expert:"+advocate2.expert+"age:"+advocate2.age);

        Advocatemethod advocate3=new Advocatemethod("ritesh","law","shivpuri","divorce",33);

        System.out.println("advocate3 name is:"+advocate3.name+"department:"+advocate3.Department+"city:"+advocate3.city+"expert:"+advocate3.expert+"age:"+advocate3.age);

        Advocatemethod advocate4=new Advocatemethod("raghav","law","khandwa","corporate",43);

        System.out.println("advocate4 name is:"+advocate4.name+"department:"+advocate4.Department+"expert:"+advocate4.expert+"age:"+advocate4.age);

        Advocatemethod advocate5=new Advocatemethod("harpal","law","indore","criminal",22);

        System.out.println("advocate5 name is:"+advocate5.name+"department:"+advocate5.Department+"city:"+advocate5.city+"age:"+advocate5.age);


        System.out.println("using the data setter method");


        advocate1.setName("rohan");
        System.out.println("advocate1 name is:"+advocate1.name+"department:"+advocate1.Department+"city:"+advocate1.city+"expert:"+advocate1.expert+"age:"+advocate1.age);

        advocate2.setDepartment("politics");
        System.out.println("advocate2 name is:"+advocate2.name+"department:"+advocate2.Department+"city:"+advocate2.city+"expert:"+advocate2.expert+"age:"+advocate2.age);

        advocate3.setCity("agra");
        System.out.println("advocate3 name is:"+advocate3.name+"department:"+advocate3.Department+"city:"+advocate3.city+"expert:"+advocate3.expert+"age:"+advocate3.age);

        advocate4.setExpert("bussiness");
        System.out.println("advocate4 name is:"+advocate4.name+"department:"+advocate4.Department+"expert:"+advocate4.expert+"age:"+advocate4.age);

        advocate5.setAge(44);
        System.out.println("advocate5 name is:"+advocate5.name+"department:"+advocate5.Department+"city:"+advocate5.city+"age:"+advocate5.age);




        }
    }

