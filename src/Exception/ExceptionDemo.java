package Exception;

public class ExceptionDemo {
    public int Division(int a, int b) {
        int c = 0;
        try {
            c = a / b;
        } catch (Exception E) {
            System.out.println("Exception occurred " + E);
        }
        return c;
    }

    public void DisplayArray() {
        int Arr[] = {1, 3, 5, 7, 32, 45};
        try {
            System.out.println(Arr[7]);

        } catch (Exception e) {
            System.out.println("Exception occurred is " + e);
        }
    }


    public static void main(String[] args) {
        ExceptionDemo obj = new ExceptionDemo();
        System.out.println("Before calling divide method");
        int c = obj.Division(8, 2);
        System.out.println("After calling divide method");
        System.out.println("Result is " + c);

        System.out.println("Before calling divide method");
        c = obj.Division(8, 0);
        System.out.println("After calling divide method");
        System.out.println("Result is " + c);

        System.out.println("Before calling Array method");

        obj.DisplayArray();
        System.out.println("After calling Array method");


    }

}
