package test_25_07_2023_java;

public class Persentage_test {

    public static void main(String[] args) {
        int number = 500;

        int persentage = 500 * 5 / 100;

        System.out.println("printing the value of 500 by 5 persentage" + "=" + persentage);
        double num = 500;

        num = 500 * 5 / 100;

        System.out.println("print persentage" + "=" + num);


        int num1 = 250;
        for (int i = 1; i <= 250; i++
) {
            if (i % 2 == 0) {
                System.out.println("print even number" + "=" + i);
            }

            for (int j = 1; j <= 250; j++) {
                if (j % 3 == 0) {
                    System.out.println("print odd number" + "=" + j);
                }


             }

        }
    }
}