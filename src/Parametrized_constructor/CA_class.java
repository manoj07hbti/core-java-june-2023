package Parametrized_constructor;

public class CA_class {

    String name;

    String profession;

    String city;

    String expert;

    int age;

    public CA_class(String name, String profession, String city, String expert, int age) {
        this.name = name;
        this.profession = profession;
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

        CA_class ca1=new CA_class("gourav","ca","ahemdabad","taxation",56);

        System.out.println("ca1 name is:"+ca1.name+"profession:"+ca1.profession+"city:"+ca1.city+"expert:"+ca1.expert+"age:"+ca1.age);

        CA_class ca2=new CA_class("akash","ca","rajkot","salestax",64);

        System.out.println("ca2 name is:"+ca2.name+"profession:"+ca2.profession+"city:"+ca2.city+"expert:"+ca2.expert+"age:"+ca2.age);

        CA_class ca3=new CA_class("mritunjay","ca","porbandar","corporatetax:",43);

        System.out.println("ca1 name is:"+ca3.name+"profession:"+ca3.profession+"city:"+ca3.city+"expert:"+ca3.expert+"age:"+ca3.age);

        CA_class ca4=new CA_class("aman","ca","vellore","advancedtax",65);

        System.out.println("ca4 name is:"+ca4.name+"profession:"+ca4.profession+"city:"+ca4.city+"expert:"+ca4.expert+"age:"+ca4.age);

        CA_class ca5=new CA_class("rohan","ca","banglore","gst",67);

        System.out.println("ca5 name is :"+ca5.name+"profession:"+ca5.profession+"city:"+ca5.city+"expert:"+ca5.expert+"age:"+ca5.age);


        System.out.println("data is using in setter method");

        ca1.setName("pawan sharma");
        ca1.setProfession("advocate");
        ca1.setCity("khandwa");
        ca1.setExpert("accountancy");
        ca1.setAge(78);
        System.out.println("ca1 name is:"+ca1.name+"profession:"+ca1.profession+"city:"+ca1.city+"expert:"+ca1.expert+"age:"+ca1.age);

        ca2.setName("chetan dixit");
        ca2.setProfession("bussinessman");
        ca2.setCity("khargone");
        ca2.setExpert("taxation");
        ca2.setAge(78);
        System.out.println("ca2 name is:"+ca2.name+"profession:"+ca2.profession+"city:"+ca2.city+"expert:"+ca2.expert+"age:"+ca2.age);

        ca3.setName("ramkumar");
        ca3.setProfession("govt.job");
        ca3.setCity("guna");
        ca3.setExpert("accountant");
        ca3.setAge(56);
        System.out.println("ca3 name is:"+ca3.name+"profession:"+ca3.profession+"city:"+ca3.city+"expert:"+ca3.expert+"age:"+ca3.age);

        ca4.setName("rajendra");
        ca4.setProfession("flat dealer");
        ca4.setCity("darbanga");
        ca4.setExpert("corporate sector");
        ca4.setAge(33);
        System.out.println("ca4 name is:"+ca4.name+"profession:"+ca4.profession+"city:"+ca4.city+"expert:"+ca4.expert+"age:"+ca4.age);

        ca5.setName("ankit");
        ca5.setProfession("car dealer");
        ca5.setCity("guhawati");
        ca5.setExpert("indirect tax");
        ca5.setAge(44);
        System.out.println("ca5 name is:"+ca5.name+"profession:"+ca5.profession+"city:"+ca5.city+"expert:"+ca5.expert+"age:"+ca5.age);




    }
}
