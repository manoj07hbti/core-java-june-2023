package method.input_parameter;

public class PrimeNumber {

    //TODO write a code to find particular prime
    //TODO Syntax : access_specifier return_type  method_name (Datatype varName....) { CODE..}

    public void findPrime(int number) {

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Number is Prime :" + number);
        } else {
            System.out.println("Number is NOT Prime :" + number);

        }
    }

    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        obj.findPrime(1);
        obj.findPrime(2);
        obj.findPrime(3);
        obj.findPrime(4);
        obj.findPrime(5);
        obj.findPrime(6);
        obj.findPrime(7);
        obj.findPrime(8);
        obj.findPrime(9);
        obj.findPrime(10);

    }
}
