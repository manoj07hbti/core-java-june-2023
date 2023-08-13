package Method;

// find single prime number

public class PrimeNumber_Single {

    public void primeNumber_single() {

        int number = 7;
        boolean isprime = true;
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                isprime = false;

            }
        }
        if (isprime) {
            System.out.println("number is prime..." + number);
        } else {
            System.out.println("number is not prime..." + number);
        }
    }

    public static void main(String[] args) {

        PrimeNumber_Single obj = new PrimeNumber_Single();

        obj.primeNumber_single();


    }

}
