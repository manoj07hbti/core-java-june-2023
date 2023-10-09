package oops.inheritance.polymorphism;

public class Child extends Parent{

    @Override
    public void m1(){
        System.out.println("This is Child class method m1");
    }

    @Override
    public void m2(){

        System.out.println("This is Child class method M2");
    }
    public static void main(String[] args) {
       Parent obj= new Parent();
       obj.m1(); // we have created object of Parent class so it called parent class method

        Parent obj1=new Child();
        obj1.m1();// since we have created object of child class so this will always call child class method

        /*Child obj2= new Parent(); // compile time error : Child variable can not hold parent object
        obj.m1();//*/

    }
}
