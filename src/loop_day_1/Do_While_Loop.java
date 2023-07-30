package loop_day_1;

public class Do_While_Loop {
    public static void main(String args[]) {

        int number = 5;
        int multiply = 1;
        do {
            int table = number * multiply;
            System.out.println(number + " x " +multiply + " = "+ table);
            multiply++;

        } while (multiply <= 10);

        

        int number2= 10;
        int multiply2 = 1;
        do {
            int table2 = number2 * multiply2;
            System.out.println(number2 + " x " + multiply2 + " = " + table2);
            multiply2++;

        }while (multiply2<= 10);


        System.out.println("Even number between 1 and 100:");
        int num1 = 1;
        do {
            if (num1%2 == 0 ){
                System.out.println(num1 + " ");
            }
            num1 ++;
        }while (num1 <= 100);


        System.out.println("odd number between 1 and 100:");
        int num2 = 1;
        do {
            if (num2% 2!=0){
                System.out.println(num2 + " ");
            }
            num2++;
        }while (num2 <= 100);

    }

    }

