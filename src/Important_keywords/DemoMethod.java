package Important_keywords;

public class DemoMethod {
    public final void m1(){

        final String name="Ravi";
        System.out.println("Printing m1 Method...." +"Final name:" +name);
     //   name="Shiv"; // we can not assign value to final variable....
    }
    public void m2(){
        final double minBalance=2000;
        System.out.println("Printing m2 Method...." +"final Minimum Balance:" +minBalance);

    }

    public static void main(String[] args) {
        DemoMethod obj=new DemoMethod();
        obj.m1();
        obj.m2();
    }
}
