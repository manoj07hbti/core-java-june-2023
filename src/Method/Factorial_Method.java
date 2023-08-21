package Method;

public class Factorial_Method {

    //It is the number to calculate factorial

    public void factorial_Method() {
        int i, fact = 1;
        int number = 4;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
            System.out.println("factorial of given number" + fact);
        }
    }

    public void factorial_method() {

        int j, fact = 1;
        int number = 6;
        for (j = 1; j <= number; j++) {
            fact = fact * j;
            System.out.println("factorial of given number" + fact);
        }
    }

    public static void main(String[] args) {

        Factorial_Method obj = new Factorial_Method();
        obj.factorial_Method();
        obj.factorial_method();

    }

}


