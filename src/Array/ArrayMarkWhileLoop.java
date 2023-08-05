package Array;

public class ArrayMarkWhileLoop {

    public static void main (String[]args){

        int marks []={54,23,76,87,56,34,76,88};
        int name=0;
       while(name<=marks.length){
           System.out.println("Printing marks array using while :"+marks[name]);
           name++;
        }

    }
}
