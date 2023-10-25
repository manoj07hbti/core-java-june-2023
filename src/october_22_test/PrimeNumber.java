package october_22_test;

public class PrimeNumber {

    public static void main(String[] args) {
        // a number which is only divided by itself or 1 is called prime number


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
                System.out.println("Number is not Prime :" + number);
            }

        }
    }
}
