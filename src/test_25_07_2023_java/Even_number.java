package test_25_07_2023_java;

public class Even_number {

    public static void main(String[] args) {

        int number = 1;

        for (int i = 1; i < 100; i++) {

            if (i % 2 == 0) {

                System.out.println("print even number" + i);
            }
            number = 300;
            for (i = 1; i <= 300; i++) {

                if (i % 3 == 0) {
                    System.out.println("print odd number" + i);
                }
                number = 300;
                for (i = 1; i <= 300; i++) {

                    if (i % 2 == 0) {
                        System.out.println("print even number" + i);
                    }


                }


            }
        }
    }
}