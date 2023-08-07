package july_25test;

public class Odd_checker {
    public static void main(String[] args) {
        int start= 3;
int end = 300;
        System.out.println("even number between 3 and 300");
        for (int i= start; i <= end; i++) {
            if (i % 2 == 0){
                System.out.println(i + " ");
            }

        }
        System.out.println("\n odd number between 3 and 300 :");
        for (int i = start; i <= end; i++){
            if (i % 2 != 0){
                System.out.println( i + " ");
            }
        }

    }
}
