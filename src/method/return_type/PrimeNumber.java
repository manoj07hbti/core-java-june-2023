package method.return_type;

import java.io.FilterOutputStream;

public class PrimeNumber {

    //TODO write a code to check particular prime
    public int findPrimeNumber(int number) {

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                // break;
            }
        }


        if (isPrime) {
            System.out.println("number is prime :" + number);
        } else {
            System.out.println("number is NOT prime : " + number);
        }
        return number;
    }

    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        int output1 = obj.findPrimeNumber(6);
        System.out.println(output1);


    }
}
