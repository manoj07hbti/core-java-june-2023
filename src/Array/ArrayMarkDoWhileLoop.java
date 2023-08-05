package Array;

public class ArrayMarkDoWhileLoop {

    public static void main(String[]args){
        int marks []={54,23,76,87,56,34,76,88};
        int name=0;
        do{
            System.out.println("Printing marks array using while :"+marks[name]);
            name++;
        }while(name<=marks.length);
// Advance loop
        for(int  var : marks){
            System.out.println("Printing marks array :"+var);
        }


    }
}
