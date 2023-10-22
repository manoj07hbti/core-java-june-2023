package Oct_22_Test;

public class Array_Calculate {
    public static void main (String[]args){

        int arr []={1,2,3,1,4,5,2,3,2,5,5,2,7,8};
        int calculate=0;
        while(calculate<=arr.length){
            System.out.println("Printing  array using while :"+arr[calculate]);
            calculate++;
        }
      //Advance loop
        for(int  var : arr){
            System.out.println("Printing array :"+var);
        }
    }
}
