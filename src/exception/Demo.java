package exception;

public class Demo {

    public int divide(int a, int b) {

        int result = 0;

        try {
            result = a / b;
        } catch (Exception e) {
            System.out.println("Exception Occurred");
        }finally {
            System.out.println("This is finally block of divide method");
        }

        return result;


    }

    public void displayArray() {

        int[] array = {2, 3, 4, 5, 6, 7};
        try {
            System.out.println(array[7]);
        }catch (Exception exception){
            System.out.println("Exception Occurred :"+exception);
        }finally {
            System.out.println("This is finally block of display array method ");
        }

    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println("Before calling...");
        int result = obj.divide(20, 5);
        System.out.println("After calling...");
        System.out.println("Result is :" + result);
        System.out.println(" ");
        System.out.println("Before calling...");
        result=obj.divide(20,0);
        System.out.println("After calling...");
        System.out.println("Result is :"+result);
        System.out.println(" ");
        System.out.println("Before calling array method");
        obj.displayArray();
        System.out.println("After calling array method");
    }
}
