package important_keywords;

public class MethodChild extends MethodParent{

    @Override
    public void m1(){
        final String name= "Jatin";
        System.out.println("This is Child Class M1 Method");
    }

    @Override
    public void m2(){
        System.out.println("This is Child Class M2 Method");
    }

    public static void main(String[] args) {
        MethodParent obj=new MethodParent();
        obj.m1();
    }
}
