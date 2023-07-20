package condition_statement;

public class OR_Operator_Statement {
    public static void main(String[] args) {
        int RAM_Mobile=8;
        String Brand="IBM";
        if (RAM_Mobile>=8 || Brand=="IBM"){
            System.out.println("True :The  RAM Mobile and Brand are Excellent ");
        } else {
            System.out.println("false :The  RAM Mobile and Brand are not Excellent ");

        }Brand="TCS";
        if (RAM_Mobile>=8 || Brand=="IBM"){
            System.out.println("True :The  RAM Mobile and Brand are Excellent ");

        }else {
            System.out.println("false :The  RAM Mobile and Brand are not Excellent ");

        }RAM_Mobile=12;
        if (RAM_Mobile>=8 || Brand=="IBM"){
            System.out.println("True :The  RAM Mobile and Brand are Excellent ");

        }else {
            System.out.println("false :The  RAM Mobile and Brand are not Excellent ");

        }RAM_Mobile=4;
        Brand="Google";
        if (RAM_Mobile>=8  || Brand=="IBM"){
            System.out.println("True :The  RAM Mobile and Brand are Excellent ");

        }else {
            System.out.println("false :The  RAM Mobile and Brand are not Excellent ");

        }



        }
    }

