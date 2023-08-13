package Method;

public class PrimeNum_Method {

    // find prime number 1 between 15
    public void primeNumber() {

        for (int k = 1; k <= 15; k++) {
            int number = k;
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

    public static void main(String[] args) {
        PrimeNum_Method obj = new PrimeNum_Method();
        {

            obj.primeNumber();


        }
    }

}