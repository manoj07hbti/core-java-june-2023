package methds;

public class CalculatorMethod {
    public void add() {
        int a = 10;
        int b = 23;
        int add = a + b;
        System.out.println("Calculator in add method : " + add);
    }

    public void sub() {
        int c = 45;
        int d = 34;
        int sub = c - d;
        System.out.println("Printing sub method is : " + sub);
    }

    public void mul() {
        int e = 34;
        int f = 2;
        int mul = e * f;
        System.out.println("Printing mul method is : " + mul);
    }

    public void div() {
        int m = 65;
        int n = 5;
        int div = m / n;
        System.out.println("Printing div method is : " + div);
    }

    public void percentage() {
        double a = 50000;
        double b = 4;
        double result = (a * b) / 100;
        System.out.println("Printing Percentage method is : " + result);
    }

    public void cube() {
        int a = 10;
        int cubeResult = a * a * a;
        System.out.println("Printing cube method is : " + cubeResult);
    }

    public void PrimeOrNOtPrimeNumber() {
        int number = 9;
        boolean isPrime = true;
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }


        if (isPrime) {
            System.out.println("number is prime :" + number);
        } else {
            System.out.println("number is not prime : " + number);
        }
    }


    public static void main(String[] args) {
        CalculatorMethod obj = new CalculatorMethod();
        obj.add();
        CalculatorMethod obj1 = new CalculatorMethod();
        obj1.sub();
        CalculatorMethod obj2 = new CalculatorMethod();
        obj2.mul();
        CalculatorMethod obj3 = new CalculatorMethod();
        obj3.div();
        CalculatorMethod obj4 = new CalculatorMethod();
        obj4.cube();
        CalculatorMethod obj5 = new CalculatorMethod();
        obj5.percentage();
        CalculatorMethod obj6 = new CalculatorMethod();
        obj6.PrimeOrNOtPrimeNumber();

    }
}


