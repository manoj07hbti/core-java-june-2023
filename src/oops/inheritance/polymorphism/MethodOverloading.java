package oops.inheritance.polymorphism;

public class MethodOverloading {

    public void m1(){
        System.out.println("This is normal m1 method ....");
    }

    public void m1(String name){
        System.out.println("This is overloaded method with 1 String parameter m1 method ....");
    }
    public void m1(String name,int age){
        System.out.println("This is overloaded method with 1 String parameter and 1 int parameter m1 method ....");
    }


    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
        obj.m1(); // it will call m1 method which does not have parameter
        obj.m1("Hello");// it will call overloaded method which takes String input param
        obj.m1("Test",21);// it will call 3rd m1 method
    }
}
