package loop_working;

public class DoWhileLoopTable {
    public static void main(String[] args) {
// Table of 5 using while loop
        int number = 5, i = 1;

        do{

            System.out.println(number + "X" + i + " = " + i * number);
            i++;

        }while (i <= 10);

        // Table of 10 using while loop


        int numbers = 10, j = 1;
        while (j <= 10) {

            System.out.println(numbers + "X" + j + " = " + j * numbers);
            j++;

        }

    }
}
