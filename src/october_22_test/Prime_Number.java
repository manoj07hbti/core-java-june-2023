package october_22_test;

public class Prime_Number {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {


            if (isPrime(i)) {
                System.out.println(i + " is prime number ");
            }else {
                System.out.println(i + " is not prime number ");
            }
        }
    }

    static boolean isPrime(int num) {

        if (num < 2) {

            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;

            }
        }
        return true;
    }
}