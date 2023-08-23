package method;

public class Method_Class_Ass {
    // TODO Write a method for cube

    public void methodeCube(){

        int number= 4;
        System.out.println("Print the cube of 4 is = "  +number*number*number);
    }

    //TODO Write a method to check Even & Odd Number

    public void methodEvenOdd(){

        int number=9;
        if(number%2==0){

            System.out.println("Even number found:"+number);
        }else {

            System.out.println("Odd number found:" + number);
        }
    }

    public static void main(String[] args) {
        Method_Class_Ass obj = new Method_Class_Ass();
        obj.methodeCube();
        obj.methodEvenOdd();

    }
}
