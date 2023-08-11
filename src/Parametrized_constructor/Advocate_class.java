package Parametrized_constructor;

public class Advocate_class {

    String name;

    String profession;

    String city;

    String branch;

    int age;

    public Advocate_class(String name, String profession, String city, String branch, int age) {
        this.name = name;
        this.profession = profession;
        this.city = city;
        this.branch = branch;
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Advocate_class advocate1=new Advocate_class("ropan","advocate","banglore","criminal",21);

        System.out.println(" advocate1 name is:"+advocate1.name+ "profession:"+advocate1.profession+ "city:"+advocate1.city+ "branch:"+advocate1.branch+ "age:"+advocate1.age);

        Advocate_class advocate2=new Advocate_class("aditya","advocate","ropar","corporate",43);

        System.out.println("advocate2 name is:"+advocate2.name+"profession:"+advocate2.profession+"city:"+advocate2.city+"branch:"+advocate2.branch+"age:"+advocate2.age);

        Advocate_class advocate3=new Advocate_class("shyam","advocate","karnal","financial",54);

        System.out.println("advocate3 is name:"+advocate3.name+"profession:"+advocate3.profession+"city:"+advocate3.city+"branch:"+advocate3.branch+"age:"+advocate3.age);

        Advocate_class advocate4=new Advocate_class("raghav","advocate","gurugaon","animal law",34);

        System.out.println("advocate4 name is"+advocate4.name+"profession:"+advocate4.profession+"city:"+advocate4.city+"branch:"+advocate4.branch+"age:"+advocate4.age);

        Advocate_class advocate5=new Advocate_class("abhishek","advocate","guna","familylaw",43);

        System.out.println("advocate5 name is:"+advocate5.name+"profession:"+advocate5.profession+"city:"+advocate5.city+"branch:"+advocate5.branch+"age:"+advocate5.age);

        System.out.println("using the data for setter method");

        advocate1.setName("ropan kumar");

        System.out.println(" advocate1 name is:"+advocate1.name+ "profession:"+advocate1.profession+ "city:"+advocate1.city+ "branch:"+advocate1.branch+ "age:"+advocate1.age);

        advocate2.setProfession("bussinessman");
        System.out.println("advocate2 name is:"+advocate2.name+"profession:"+advocate2.profession+"city:"+advocate2.city+"branch:"+advocate2.branch+"age:"+advocate2.age);

        advocate3.setCity("datia");
        System.out.println("advocate3 is name:"+advocate3.name+"profession:"+advocate3.profession+"city:"+advocate3.city+"branch:"+advocate3.branch+"age:"+advocate3.age);


        advocate4.setBranch("martiallaw");
        System.out.println("advocate4 name is"+advocate4.name+"profession:"+advocate4.profession+"city:"+advocate4.city+"branch:"+advocate4.branch+"age:"+advocate4.age);

        advocate5.setAge(54);
        System.out.println("advocate5 name is:"+advocate5.name+"profession:"+advocate5.profession+"city:"+advocate5.city+"branch:"+advocate5.branch+"age:"+advocate5.age);





        
    }
}
