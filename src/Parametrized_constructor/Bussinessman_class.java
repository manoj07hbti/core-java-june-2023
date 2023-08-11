package Parametrized_constructor;

public class Bussinessman_class {

    String name;

    String profession;

    String city;

    String branch;

    int age;

    public Bussinessman_class(String name, String profession, String city, String branch, int age) {
        this.name = name;
        this.profession = profession;
        this.city = city;
        this.branch = branch;
        this.age = age;
    }

    public static void main(String[] args) {

        Bussinessman_class bussiness1=new Bussinessman_class("riyansh","bussinessman","raipur","fishries",54);

        System.out.println("bussinessman1 name is:"+bussiness1.name+"profession:"+bussiness1.profession+"city:"+bussiness1.city+"branch:"+bussiness1.branch+"age:"+bussiness1.age);

        Bussinessman_class bussiness2=new Bussinessman_class("priyansh","bussinessman","balaghat","outlets",78);

        System.out.println("bussinessman2 name is:"+bussiness2.name+"profession:"+bussiness2.profession+"city:"+bussiness2.city+"age:"+bussiness2.age);

        Bussinessman_class bussiness3=new Bussinessman_class("vijay","bussinessman","burhanpur","food",22);

        System.out.println();
    }
}
