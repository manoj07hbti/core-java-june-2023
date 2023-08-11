package methods;

public class DemoCalculator {

    // addition , subtraction , multi, divide

    public void addition(){
        int a=3;
        int b=7;

        int result=a+b;

        System.out.println("Sum of given number is:"+result);

    }

    public static void main(String[] args) {

        DemoCalculator obj = new DemoCalculator();
        obj.addition();

    }

}
