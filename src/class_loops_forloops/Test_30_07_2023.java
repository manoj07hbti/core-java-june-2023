package class_loops_forloops;

public class Test_30_07_2023 {

    public static void main(String[] args) {


        for (int i = -3; i <= 3; i++) {

            System.out.println(+i);
        }

        int i = -3;

        while (i <= 3) {

            System.out.println(+i);

            i++;

        }
        int j = -3;
        do {
            System.out.println(+j);
            j++;
        } while (j <= 3);


        for (int k = 1; k <= 5; k++) {

            for (int l = 1; l <= k; l++)

                System.out.print("*");
            {
                System.out.println();
            }
        }
            for (int m=1; m<=3; m++) {

                for (int n=1; n<=m; n++) {

                    System.out.print("*");
                }
                System.out.println();
            }

        }

    }

