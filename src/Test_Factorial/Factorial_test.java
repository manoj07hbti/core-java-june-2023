package Test_Factorial;



public class Factorial_test {


    public void factorial() {

        int i, fac = 1;
        int number = 10;

        for (i = 1; i <= number; i++) {
            fac = fac * i;
        }
        System.out.println("factorial of given number is:" + fac);

    }

    public static void main(String[] args) {

        Factorial_test factorial1=new Factorial_test();
        factorial1.factorial();


    }



}


