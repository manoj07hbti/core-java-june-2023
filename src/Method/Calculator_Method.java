package Method;

public class Calculator_Method {

// addition,subtraction,multiply,division,percentage:

    public void addition() {

        int x = 20;
        int y = 30;

        int result = x + y;

        System.out.println("sum of given number is:" + result);

    }

    public void subtraction() {
        int a = 9;
        int b = 5;

        int result = a - b;
        System.out.println("sub of given number is:" + result);
    }

    public void multiply() {
        int c = 4;
        int d = 9;
        int result = c * d;
        System.out.println("multiply of given number is:" + result);
    }

    public void division() {
        double e = 26;
        double f = 7;
        double result = e / f;
        System.out.println("division of given number is:" + result);
    }

    public void percentage() {
        double number = 1000;
        double percentage = 1000 * 4 / 100;
        System.out.println("percentage of given number:" + percentage);

    }

    public static void main(String[] args) {

        Calculator_Method obj = new Calculator_Method();
        obj.addition();
        obj.subtraction();
        obj.multiply();
        obj.division();
        obj.percentage();
    }


}
