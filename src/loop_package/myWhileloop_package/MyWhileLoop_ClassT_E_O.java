package loop_package.myWhileloop_package;

public class MyWhileLoop_ClassT_E_O {
    public static void main(String[] args) {

        int number = 5;
        int multiply = 1;
        while (multiply <= 10) {
            int table = number * multiply;
            System.out.println(number + "X" + multiply+ "=" + table);
            multiply++;
        }
        int number2 = 10;
        int multiply2 = 1;
        while (multiply2 <= 10) {
            int table2 = number2 * multiply2;
            System.out.println(number2 + "X" + multiply2 + "=" + table2);
            multiply2++;
        }

        System.out.println("even number between 1 to 100");
        int num=2;
        while(num<=100){
            System.out.println(num);
            num+=2;
        }
        System.out.println("odd number between 1to 100");
        int n=1;
                while(n<=100){
                    System.out.println(n);
                    n+=1;
                }
    }
    }
