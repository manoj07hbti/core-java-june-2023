package october_22_2023_Test;

public class PrimeNumber {
    public static void main(String[] args) {
        int m = 0;
        for (int i = 1; i <= 20; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    m = m + 1;
                }

            }
            if (m == 0) {
                System.out.println("Printing only prime number from 1 to 20  " + i);
            } else {
                m = 0;
            }
        }
    }
    }

