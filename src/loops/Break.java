package loops;

public class Break {


    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 7) {
                break;
            }
            System.out.println(i);
        }
////ARRAY
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //find the num 5 in given array or position

        for (int var : array) {
            System.out.println("Finding number 5 in array: "+var);
            if (var == 5) {
                System.out.println("Number is Found");
                break;
            }
        }
    }
}