package oops.inheritance.polymorphism;

public class MethodOverLoading {

    public void m1(){

        System.out.println("This is normal m1 method...");

    }

    public void m1(String name){

        System.out.println("This is overloaded method with 1 string parameter m1 method...");
    }
    public void m1(String name,int Year){

        System.out.println("This is overloaded method with 1 string parameter and 1 int parameter m1 method....");
    }

    public static void main(String[] args) {

        MethodOverLoading obj = new MethodOverLoading();
        obj.m1();// it will call m1 method with does not have parameter...
        obj.m1("Etiquette");// it will call overloaded method which takes string input param...
        obj.m1("India",2023 ); // it will call 3rd m1 method...



    }






}
