package Oct_22_Test;

public class Factorial {
    public static void main(String[] args) {

        int number = 5;

        long factorial = 1;

        for (int i = number; i > 0; i--) {

            factorial = factorial * i;

        }

        System.out.println("Factorial: " + factorial);

    }
}
