package methods;

public class DemoCalcInput {

    public int add(int a, int b ){

        int result=a+b;

       return result;
    }

    public void divide(int a, int b){

        double result=(double) a/b;

        System.out.println("Division is: "+result);


    }

    public static void main(String[] args) {
        DemoCalcInput obj= new DemoCalcInput();
       int result= obj.add(2,3);
        System.out.println("Addition is: "+result);
        obj.add(34,12);

        obj.divide(4,2);

        obj.divide(3,2);//1.5
        obj.divide(11,3);

    }

}
