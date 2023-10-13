package Oops.Inheritance.ExceptionDemo;

public class Practise1 {

    public int divide(int a,int b){
        int result=0;
        try {
            result= a/b;
        }

        catch (Exception e){
            System.out.println("Exception occurred "+e);

        }
        finally {
            System.out.println("This is Finally Block of Divide Method....");
        }
        return result;
    }
    public void displayArray(){
        int arr[]={1,32,23,6,2,3};
        try {
            System.out.println(arr[7]);
        }
        catch (Exception exception){
            System.out.println("Exception occurred :"+exception);
        }
        finally {
            System.out.println("This is Finally Block of display Array method....");
        }
    }

    public static void main(String[] args) {
        Practise1 obj=new Practise1();
        System.out.println("Before calling divide method");
        int result=obj.divide(10,5);
        System.out.println("After calling divide method");
        System.out.println("divide of number"+result);

        System.out.println("Before calling dividing method");
        result=obj.divide(10,0);
        System.out.println("After calling dividing method");
        System.out.println("dividing result"+result);

        System.out.println("Before calling Display array Method");
       obj.displayArray();
       System.out.println("after calling display array method");







    }
}
