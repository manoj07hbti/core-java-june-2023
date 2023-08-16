package august_13_test3;

public class FindPrimeNo {
    public static void main(String[] args) {


        for (int no = 10; no <20; no++) {
            int temp = 0;
            for (int i = 2; i <= no-1; i++) {
                while (no % i == 0) {
                    temp = temp + 1;
                    break;
                }
            }

            if (temp == 0) {
                System.out.println("prime" + no);
            } else {
                System.out.println(" Not prime no" + no);
            }
        }
    }
}
