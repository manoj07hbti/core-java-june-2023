package methods;

public class DemoCalcInput {

    public void add(int a, int b ){

        int result=a+b;

        System.out.println("Addition is: "+result);

    }

    public void divide(int a, int b){

        double result=(double) a/b;

        System.out.println("Division is: "+result);


    }

    public static void main(String[] args) {
        DemoCalcInput obj= new DemoCalcInput();
        obj.add(2,3);
        obj.add(34,12);

        obj.divide(4,2);

        obj.divide(3,2);//1.5
        obj.divide(11,3);

    }

}
