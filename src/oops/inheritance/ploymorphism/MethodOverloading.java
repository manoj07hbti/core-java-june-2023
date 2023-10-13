package oops.inheritance.ploymorphism;

public class MethodOverloading {



    public void m1(){
        System.out.println("This is my First Polymorphism Class....");
    }

    public void m1(String Name){
        System.out.println("This is my First Polymorphism Class with Overloaded Method with 1 String Parameter at M1....");
    }
    public void m1(String Name,int Age){
        System.out.println("This is my First Polymorphism Class with Overloaded Method with 1 String Parameter and 1 int Parameter at M1....");
    }
    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.m1(); //it will call M1 method which does not have parameter
        obj.m1("Oppenheimer");//it will call overloaded method which takes String parameter
        obj.m1("java",123);//it will call 3rd overloaded method

    }
}
