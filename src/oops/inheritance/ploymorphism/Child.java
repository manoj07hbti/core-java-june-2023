package oops.inheritance.ploymorphism;

public class Child extends Parent{

    public static void main(String[] args) {
        Parent obj=new Parent();//we have created parent class, so it called parent Class Method.....
        obj.m1();
        obj.m2();
        System.out.println(" ");
        Parent obj1=new Child();
        obj1.m1();// since we have created object of child class so this will always call child class method.....
        obj1.m2();
        /*Child obj2= new Parent(); // compile time error : Child variable can not hold parent object
        obj.m1();//*/
    }


    @Override
    public void m1(){
        System.out.println("This is Child1.0 Class M1 Method......");
    }
   @Override
    public void m2(){
        System.out.println("This is Child1.1 Class M2 Method......");
    }

}
