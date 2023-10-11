package exception_demo;

import jdk.nashorn.internal.runtime.ECMAException;

public class Demo {

    public int divide(int a, int b){
        int result=0;
      try {
          result= a/b;
         }
        catch (Exception e){
            System.out.println("Exception occurred "+e);
        }
      finally {
          System.out.println("This is finally block of divide method.....");
      }

      return result;
    }

    public void displayArray(){

        int arr[]={1,32,43,6,2,3};
      try {
          System.out.println(arr[3]);
      }
      catch (Exception exception){
          System.out.println("Exception occurred: "+exception);

      }
      finally{
          System.out.println("This is finally block of display array method...");
      }
    }

    public static void main(String[] args) {

        Demo obj= new Demo();
        System.out.println("Before calling divide method");
        int result=obj.divide(4,2);
        System.out.println("After calling divide method");
        System.out.println("Result is: "+result);

        System.out.println("Before calling divide method");
        result=obj.divide(4,0);
        System.out.println("After calling divide method");
        System.out.println("Result is: "+result);

        System.out.println("Before calling displayArray method");
        obj.displayArray();
        System.out.println("After calling displayArray method");

    }
}
