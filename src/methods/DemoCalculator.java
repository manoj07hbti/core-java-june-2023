package methods;

public class DemoCalculator {
    public void addition() {

        int a = 4;
        int b = 6;
        int c = a + b;
        System.out.println("Addition is " + c);

    }

    public void subraction() {

        int a = 14;
        int b = 6;
        int c = a - b;
        System.out.println("Subtraction is " + c);

    }

    public void multipication() {

        int a = 14;
        int b = 6;
        int c = a * b;
        System.out.println("Multipication is " + c);
    }

    public void divide(){

        int a=66;
        int b=2;

        double divide= (double) a/b;

        System.out.println("Division is : "+divide);
    }
    public static void main(String[] args) {
        DemoCalculator obj = new DemoCalculator();
        obj.addition();
        obj.subraction();
        obj.multipication();
        obj.divide();

    }
}
