package method;

public class PrimeNumber {

    //TODO Write a code to find a percentage
    // TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}

    public void findPrime() {
        for (int j = 1; j <= 100; j++) {

            long number = j;
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

    public static void main(String[] args) {
        PrimeNumber obj=new PrimeNumber();
        obj.findPrime();
    }
}