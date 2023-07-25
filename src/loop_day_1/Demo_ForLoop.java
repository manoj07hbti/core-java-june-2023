package loop_day_1;

public class Demo_ForLoop {
    public static void main(String args []){
        int number = 5;

        for (int i=1;i<=10; i++){
            System.out.println("Printing table of five.."+number+" X "+i+" = "+number*i);
        }

        int number1 = 10;

        for (int i=1; i<=10; i++){
            System.out.println("Printing table of ten.."+number1+" X "+i+" = "+number1*i);
        }

        int start=1;
        int end = 100;
        System.out.println("Even number between 1 and 100:");
        for (int i=start; i<=end; i++ ){
            if (i%2==0){
                System.out.println(i + " ");
            }
        }

        System.out.println("Odd number between 1 and 100:");
        for (int i=start; i<= end; i++ ){
            if (i%2 !=0){
                System.out.println(i + " ");
            }

        }
    }
}
