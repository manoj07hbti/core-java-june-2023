package myWhileloop_package;

public class MyDoWhileLoop_class_Table {
    public static void main(String[] args) {

        int number = 9;
        int i = 1;
        System.out.println("multiplication table of 9:");
        do {
            int result = number * 1;
            System.out.println(number + "x" + i + "=" + result * i);
            i++;
        } while (i <= 10);

        int num = 10;
        int v = 1;
        System.out.println("printing table of 10:");
        do {
            int result = num * v;
            System.out.println(num + "x" + v + "=" + num * v);
            v++;

        } while (v <= 10);

    }
}




