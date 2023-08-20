package returntype_method;

public class Calculator_Method {

    // create a method which will provide cube,square, Add, subtract,multiply,division,percentage
    // of given number....

    public int makeCube(int number) {

        int cube = number * number * number;

        return cube;
    }

    public int Add(int a, int b) {
        int A = 40;
        int B = 80;
        int result = A + B;

        return result;
    }

    public int subtract(int n, int m) {

        int N = 45;
        int M = 23;
        int result = N - M;
        return result;
    }

    public int square(int a) {

        int num = 45;
        int result = num * num;
        return result;
    }

    public int multiply(int a, int b) {

        int s = 34;
        int s1 = 12;
        int result = s * s1;
        return result;
    }

    public double division(double a, double b) {
        double A = 248;
        double B = 19;
        double result = A / B;
        return result;
    }

    public double percentage(int number) {
        double num = 500;
        double percentage = (num * 100) / 600;
        return percentage;
    }

    public static void main(String[] args) {

        Calculator_Method obj = new Calculator_Method();

        int output = obj.makeCube(3);
        System.out.println("cube of given number is..." + output);

        int result = obj.makeCube(7);
        System.out.println("cube of given number is..." + result);

        int output1 = obj.Add(40, 80);
        System.out.println("add of given number is..." + output1);

        int output2 = obj.subtract(45, 23);
        System.out.println("subtract of given number is..." + output2);

        int output3 = obj.square(45);
        System.out.println("square of given number is..." + output3);

        int output4 = obj.multiply(34, 12);
        System.out.println("multiply of given number is..." + output4);

        double output5 = obj.division(248, 19);
        System.out.println("division of given number is..." + output5);

        double output6 = obj.percentage(500);

        System.out.println("percentage of given number is..." + output6);


    }


}

















