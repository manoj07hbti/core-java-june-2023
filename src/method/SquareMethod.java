package method;

public class SquareMethod {

//TODO write a code to make square
    //TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}

    public void findSquare(){
        int number = 3;
        System.out.println("Square of "+number+" is "+number*number);

    }

    public static void main(String[] args) {

        SquareMethod obj=new SquareMethod();
        obj.findSquare();
    }
}
