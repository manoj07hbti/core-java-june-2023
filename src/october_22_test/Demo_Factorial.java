package october_22_test;

public class Demo_Factorial {
    // Write a code to make factorial of number:

    public static void main(String args[]) {
        int number = 6;
        int factorial = 1;

        for (int i = number; i > 0; i--) {

            factorial = factorial * i;
        }
        System.out.println(" Factorial is:" + factorial);

    }


  }
