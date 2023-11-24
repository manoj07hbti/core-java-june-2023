package oops.inheritance.polymorphism;

public class Child extends Parent {
    @Override // representation....
    public void m1(){

        System.out.println("This is child class method m1");
    }

    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.m1(); // we have created object of parent class that's why it will Call parent class method..

        Parent obj1= new Child();
        obj1.m1();// since we have created object of child class so that's why this will always  call child class method...

       /*Child obj2 = new Parent(); // compile time error child variable cant not hold parent object
        obj.m1();//*/




    }
}
