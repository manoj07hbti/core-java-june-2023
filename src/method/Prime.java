package method;

public class Prime {

    public void findPrime() {


        int number = 31;
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
            System.out.println("number is not prime : " + number);
        }
    }

    public static void main(String[] args) {
        Prime obj=new Prime();
        obj.findPrime();
    }
}