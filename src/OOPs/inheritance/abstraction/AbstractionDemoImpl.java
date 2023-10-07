package OOPs.inheritance.abstraction;

public class AbstractionDemoImpl extends AbstractionDemo {


    @Override
    public void M2() {
        System.out.println("This is implement method ... ");
    }

    @Override
    public void M3() {
        System.out.println("");
    }

    public static void main(String[] args) {
        AbstractionDemoImpl obj=new AbstractionDemoImpl();
        obj.M2();
        obj.M1();

    }

}

