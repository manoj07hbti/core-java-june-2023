package exception_demo;

public class Exception_Demo {

public int divide(int a,int b) {

    int result = 0;

    try {
        result = a / b;
    } catch (Exception e) {
        System.out.println("Exception occurred" + e);
    } finally {
        System.out.println("this is finally block of divide method....");
    }
    return result;
      }
    public void ArrayDisplay() {

        int arr[] = {21, 34, 56, 96, 23};
        try{
            System.out.println(arr[6]);
        }
        catch (Exception exception){
            System.out.println("Exception occurred :"+exception);
        }
         finally {
            System.out.println("this is finally block of display array method...");
        }
        System.out.println(arr[3]);
      }
    public static void main(String[] args) {
        Exception_Demo obj = new Exception_Demo();
        System.out.println("Before calling Divide Method....");
        int result = obj.divide(8,2);
        System.out.println("After calling Divide Method....");
        System.out.println("Result is :"+result);

        System.out.println("Before calling Divide Method....");
        result = obj.divide(8,0);
        System.out.println("After calling Divide Method....");
        System.out.println("Result is :"+result);

        System.out.println("Before calling displayArray Method....");
        obj.ArrayDisplay();
        System.out.println("Before calling displayArray Method....");


    }

}
