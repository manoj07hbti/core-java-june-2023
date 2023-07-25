package july_25_test;

public class Odd_And_Even_check {
    public static  void  main(String args []){
        int start = 3;
        int end = 300;

        System.out.println("Even numbers between 3 and 300:");
        for (int i = start; i <= end; i++){

            if (i % 2 == 0) {

                System.out.println(i + " ");
            }
        }
        System.out.println("n odd number between 3 and 300:");
        for (int i = start; i <= end; i++){
            if (i % 2 !=0){
                System.out.println(i+ " ");
            }
        }

    }

}
