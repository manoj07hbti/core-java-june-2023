package Method2;

public class Factorial {

    public void factorial() {

        int i, fac = 1;
        int number = 10;

        for (i = 1; i <= number; i++) {
            fac = fac * i;
        }
        System.out.println("factorial of given number is:" + fac);

    }

    public static void main(String[] args) {

        Factorial factorial1=new Factorial();
        factorial1.factorial();

    }



        }


