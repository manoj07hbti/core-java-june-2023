package PatternStatement;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        for (int j=1;j<=200;j++){
            int number = j;
            boolean isprime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isprime = false;
                }
            }
            if (isprime) {
                System.out.println(" prime number :" + number);
            }else {
                System.out.println("Not prime number :" +number);

            }
        }
    }
}
