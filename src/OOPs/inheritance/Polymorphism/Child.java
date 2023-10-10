package OOPs.inheritance.Polymorphism;

public class Child extends Parent {
    @Override
    public void m1() {
        System.out.println("this is Child class method m1");
    }

    @Override
    public void m2() {
        System.out.println("this is Child class method m2");
    }


    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.m1();
        Parent obj1 = new Child();
        obj1.m1();
        //   Child obj2=new Parent(); Compiler time error: Child variable can not hold parent object
        //  obj2.m1();
        Parent obj3 = new Parent();
        obj3.m2();
        obj3 = new Child();
        obj3.m2();
    }

}
