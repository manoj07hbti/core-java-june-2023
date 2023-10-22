package Oct_22_Test;

public class Prime_Number {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
        int number = i;
        boolean isPrime = true;
        for (int j=2; j<number ; j++){
            if (number % j == 0){
                isPrime=false;
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
