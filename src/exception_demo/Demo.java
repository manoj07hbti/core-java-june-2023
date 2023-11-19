package exception_demo;

public class Demo {

    public int Divide(int a,int b){

        int result = 0;
        try {
            result = a/b;
        }
        catch (Exception e){
            System.out.println(" Exception occurred "+e);
        }
        return result;
    }
    public void DisplayArray(){

        int array[]={1,32,43,6,2,3};
        try {
            System.out.println(array[32]);
        }
        catch (Exception exception){
            System.out.println("Exception occurred "+exception);
        }
    }
    public static void main(String args []){

        Demo Obj = new Demo();
        System.out.println(" Before calling divide method result :");
        int result = Obj.Divide(8,4);
        System.out.println(" Result is: "+result);

        System.out.println(" After calling divide method result : ");
        int result1 = Obj.Divide(4,0);
        System.out.println(" Result is: "+result);

        System.out.println(" Before calling Display array method ");
        Obj.DisplayArray();
        System.out.println(" After calling display array method ");

    }
}
