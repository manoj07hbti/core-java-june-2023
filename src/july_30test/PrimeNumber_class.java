package july_30test;

public class PrimeNumber_class {
    public static void main(String[] args) {
        System.out.println("printing prime number 1 between 20");

        for (int j = 1; j <= 20; j++) {
            int number = j;
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Number is Prime :" + number);
            } else {
                System.out.println("Number is NOT Prime :" + number);
            }
        }
    }
}
