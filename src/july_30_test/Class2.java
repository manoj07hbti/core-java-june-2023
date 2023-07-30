package july_30_test;

public class Class2 {
    public static void main(String[] args) {

        int num1 = 1, num2 = 20;
        while (num1 < num2) {
            boolean flag = false;
            for (int i = 2; i <= num1 / 2; ++i) {
                // condition for nonprime number
                if (num1 % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && num1 != 0 && num1 != 1)//<-------------------important line
                System.out.println(num1 + " ");
            ++num1;
        }
    }
}
